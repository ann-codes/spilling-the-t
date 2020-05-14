package com.launchacademy.giantleap.seeders;

import com.launchacademy.giantleap.helpers.PassHash;
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
    List<User> seedList = new ArrayList<>();

    User user1 = new User();
    PassHash pw1 = new PassHash("lazycat2001");
    user1.setUsername("lazycat2001");
    user1.setPassword(pw1.saltAndHash());
    user1.setEmail("cool@cat.com");
    user1.setFirstName("Bob");
    user1.setLastName("TheCat");
    user1.setLocation("New Horizons, USA");
    user1.setImageUrl(
        "https://vignette.wikia.nocookie.net/animalcrossing/images/b/be/175px-Bob_NLa.png");
    seedList.add(user1);

    User user2 = new User();
    PassHash pw2 = new PassHash("superGirl");
    user2.setUsername("superGirl");
    user2.setPassword(pw2.saltAndHash());
    user2.setEmail("mira@bunny.com");
    user2.setFirstName("Mira");
    user2.setLastName("Rabbit");
    user2.setLocation("In your Dreams");
    user2.setImageUrl("https://nookipedia.com/w/images/thumb/0/0c/Mira_NL.png/200px-Mira_NL.png");
    seedList.add(user2);

    User user3 = new User();
    PassHash pw3 = new PassHash("loanshark");
    user3.setUsername("loanshark");
    user3.setPassword(pw3.saltAndHash());
    user3.setEmail("gimme@yomoney.com");
    user3.setFirstName("Tom");
    user3.setLastName("Nook");
    user3.setLocation("Boston, MA");
    user3.setImageUrl("https://upload.wikimedia.org/wikipedia/en/7/72/Tom_Nook.png");
    seedList.add(user3);

    User user4 = new User();
    PassHash pw4 = new PassHash("townmanager");
    user4.setUsername("townmanager");
    user4.setPassword(pw4.saltAndHash());
    user4.setEmail("best@girl.com");
    user4.setFirstName("Isabelle");
    user4.setLastName("Pup");
    user4.setLocation("Resident Services");
    user4.setImageUrl("https://dodo.ac/np/images/thumb/9/95/Isabelle_NH.png/200px-Isabelle_NH.png");
    seedList.add(user4);

    User user5 = new User();
    PassHash pw5 = new PassHash("koolguy");
    user5.setUsername("koolguy");
    user5.setPassword(pw5.saltAndHash());
    user5.setEmail("yall@want.me");
    user5.setFirstName("Raymond");
    user5.setLastName("Heterochromia");
    user5.setLocation("CoolTown, New Horizons");
    user5.setImageUrl("https://dodo.ac/np/images/2/2a/Raymond_NH.png");
    seedList.add(user5);

    User user6 = new User();
    PassHash pw6 = new PassHash("ohnooo");
    user6.setUsername("ohnooo");
    user6.setPassword(pw6.saltAndHash());
    user6.setEmail("no@cheating.com");
    user6.setFirstName("Mr.");
    user6.setLastName("Ressetti");
    user6.setLocation("Underground, Earth");
    user6.setImageUrl("https://dodo.ac/np/images/thumb/f/f9/Resetti_AF.png/200px-Resetti_AF.png");
    seedList.add(user6);

    for (User user : seedList) {
      List<User> matchUsername = userRepository.findAllByUsername(user.getUsername());
      if (matchUsername.size() == 0) {
        userRepository.save(user);
      }
    }
  }

}
