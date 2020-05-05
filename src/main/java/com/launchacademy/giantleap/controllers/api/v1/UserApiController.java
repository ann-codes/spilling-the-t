package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.dtos.UserDto;
import com.launchacademy.giantleap.models.User;
import com.launchacademy.giantleap.repositories.UserRepository;
import com.launchacademy.giantleap.services.UserService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserApiController {

  private UserRepository userRepo;
  private UserService userService;

  @Autowired
  public UserApiController(UserRepository userRepo, UserService userService) {
    this.userRepo = userRepo;
    this.userService = userService;
  }

  @GetMapping("users/all")
  public Iterable<UserDto> getAllUsersDto() {
    return userService.findAllIterable();
  }

  @GetMapping("users/all-pageable")
  public Page<User> getAllUsersDtoPageable(@RequestParam(required = false) Integer page) {
    if (page == null) {
      page = 0;
    }
    Pageable pageable = PageRequest.of(page, 50);
    return userService.findAll(pageable);
  }

  @GetMapping("users/all-full")
  public Iterable<User> getAllUsers() {
    return userRepo.findAll();
  }

  @GetMapping("user/{username}")
  public User getUserByUsername(@PathVariable String username) {
    return userRepo.findByUsername(username);
  }

  @GetMapping("user-private/{username}")
  public UserDto getUserByUsernameDto(@PathVariable String username) {
    return userService.findUserByUsernameDto(username);
  }

  @PostMapping("user/new")
  public ResponseEntity createUser(@Valid @RequestBody User user,
      BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.NOT_ACCEPTABLE);
    } else {
      return new ResponseEntity<User>(userRepo.save(user),
          HttpStatus.CREATED);
    }
  }

}
