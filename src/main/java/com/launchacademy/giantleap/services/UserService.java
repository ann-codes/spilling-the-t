package com.launchacademy.giantleap.services;

import com.launchacademy.giantleap.dtos.UserDto;
import com.launchacademy.giantleap.models.User;
import com.launchacademy.giantleap.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class UserService {

  @Autowired
  private UserRepository userRepo;

  public Page findAll(Pageable pageable) {
    Page<User> usersInDb = userRepo.findAll(pageable);
    List<UserDto> userDtos = new ArrayList<>();
    for (User user : usersInDb.getContent()) {
      userDtos.add(UserDto.fromUser(user));
    }
    return new PageImpl<UserDto>(userDtos, pageable, usersInDb.getTotalElements());
  }

  public Iterable<UserDto> findAllIterable() {
    List<User> usersInDb = userRepo.findAll();
    List<UserDto> userDtos = new ArrayList<>();
    for (User user : usersInDb) {
      userDtos.add(UserDto.fromUser(user));
    }
    return userDtos;
  }

  public Iterable<UserDto> findAllByUsernameDto(String username) {
    List<User> usersInDb = userRepo.findAll();
    List<UserDto> userDtos = new ArrayList<>();
    for (User user : usersInDb) {
      if (username.equals(user.getUsername())) {
        userDtos.add(UserDto.fromUser(user));
      }
    }
    return userDtos;
  }

  public UserDto findUserByUsernameDto(String username) {
    List<User> usersInDb = userRepo.findAll();
    List<UserDto> userDtos = new ArrayList<>();
    for (User user : usersInDb) {
      if (username.equals(user.getUsername())) {
        userDtos.add(UserDto.fromUser(user));
      }
    }
    return userDtos.get(0);
  }


}
