package com.launchacademy.giantleap.repositories;

import com.launchacademy.giantleap.models.User;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer>{

  public User findByUsername(String username);
  public List<User> findAll();
  public List<User> findAllByUsername(String username);
//  public List<User> finaAllByUsernameAndByPassword(String username, String password);

}
