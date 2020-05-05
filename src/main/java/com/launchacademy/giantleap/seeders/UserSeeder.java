package com.launchacademy.giantleap.seeders;

import com.launchacademy.giantleap.models.User;
import com.launchacademy.giantleap.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserSeeder {

  private UserRepository userRepository;

  @Autowired
  public UserSeeder(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public void seed() {
    List<User>seedList = new ArrayList<>();

    User user1 = new User();
    user1.setUsername("coolcat2001");
    user1.setPassword("burritoyummy");
    user1.setEmail("cool@cat.com");
    user1.setFirstName("Bob");
    user1.setLastName("TheCat");
    user1.setLocation("New Horizons, USA");
    user1.setImageUrl("https://vignette.wikia.nocookie.net/animalcrossing/images/b/be/175px-Bob_NLa.png");
    seedList.add(user1);

    User user2 = new User();
    user2.setUsername("superGirl");
    user2.setPassword("iamfromspace143");
    user2.setEmail("mira@bunny.com");
    user2.setFirstName("Mira");
    user2.setLastName("Rabbit");
    user2.setLocation("In your Dreams");
    user2.setImageUrl("https://nookipedia.com/w/images/thumb/0/0c/Mira_NL.png/200px-Mira_NL.png");
    seedList.add(user2);

    User user3 = new User();
    user3.setUsername("loanshark");
    user3.setPassword("password123");
    user3.setEmail("gimme@yomoney.com");
    user3.setFirstName("Tom");
    user3.setLastName("Nook");
    user3.setLocation("Boston, MA");
    user3.setImageUrl("https://upload.wikimedia.org/wikipedia/en/7/72/Tom_Nook.png");
    seedList.add(user3);

    for (User user: seedList) {
      List<User> matchUsername = userRepository.findAllByUsername(user.getUsername());
      if (matchUsername.size() == 0) {
        userRepository.save(user);
      }
    }

  }


}
