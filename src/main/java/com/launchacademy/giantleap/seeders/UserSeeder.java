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


    User user4 = new User();
    user4.setUsername("FurSakes");
    user4.setPassword("immunocompro");
    user4.setEmail("gimme@furrylove.com");
    user4.setFirstName("Markeisha");
    user4.setLastName("Kitty");
    user4.setLocation("Boston, MA");
    user4.setImageUrl("https://i7.pngflow.com/pngimage/987/695/png-gray-wolf-catgirl-werewolf-art-cat-animals-carnivoran-furry-fandom-fictional-character-clipart.png");
    seedList.add(user4);

    User user5 = new User();
    user5.setUsername("PatoisPat");
    user5.setPassword("patmcpatty");
    user5.setEmail("SaPase@Naboule.com");
    user5.setFirstName("Louis");
    user5.setLastName("L'Enfant");
    user5.setLocation("Boston, MA");
    user5.setImageUrl("https://www.pngitem.com/pimgs/m/515-5158266_cute-african-american-boy-cartoon-vector-character-african.png");
    seedList.add(user5);

    User user6 = new User();
    user6.setUsername("MarleyMan");
    user6.setPassword("dassitOne2");
    user6.setEmail("wagwon@skeetit.com");
    user6.setFirstName("Trevor");
    user6.setLastName("Henry");
    user6.setLocation("Boston, MA");
    user6.setImageUrl("https://img.pngio.com/african-avatar-boy-cap-character-fashion-gangster-glasses-jamaican-man-png-512_512.png");
    seedList.add(user6);

    User user7 = new User();
    user7.setUsername("TiredBruh");
    user7.setPassword("tiredwa");
    user7.setEmail("biowork@biogen.com");
    user7.setFirstName("Oneoae");
    user7.setLastName("Monae");
    user7.setLocation("Boston, MA");
    user7.setImageUrl("https://cdn.imgbin.com/19/8/11/imgbin-cartoon-muscular-PjkLEQEegLEDvRw1xDHjxnuKA.jpg");
    seedList.add(user7);

    User user8 = new User();
    user8.setUsername("YDidthihappen");
    user8.setPassword("password123");
    user8.setEmail("yofam@whosemansisthis.com");
    user8.setFirstName("Lauren");
    user8.setLastName("Mountain");
    user8.setLocation("East Boston, MA");
    user8.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTZRfuzmqeLh8iCRzheCIPROpVzCHma8m3OiHnvUCEjfqJqOa_V&usqp=CAU");
    seedList.add(user8);

    User user9 = new User();
    user9.setUsername("SmackMe");
    user9.setPassword("bodegaboys");
    user9.setEmail("porae@money.com");
    user9.setFirstName("Tomas");
    user9.setLastName("Merondaez");
    user9.setLocation("Boston, MA");
    user9.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcR74_J6gqQyn3jOi9K8wHpCFoDzQZL9bME7IHCbaPUaXdgomX1A&usqp=CAU");
    seedList.add(user9);

    User user10 = new User();
    user10.setUsername("ShanghaiHi");
    user10.setPassword("Washit");
    user10.setEmail("MimiDasheshe@money.com");
    user10.setFirstName("Mimi");
    user10.setLastName("Xiao");
    user10.setLocation("Boston, MA");
    user10.setImageUrl("https://cdn4.iconfinder.com/data/icons/occupation-and-people-avatar-vol-3-2/128/sailor_japanese_avatar_people_student_person_girl-512.png");
    seedList.add(user10);

    User user11 = new User();
    user11.setUsername("SapporoMan");
    user11.setPassword("poija");
    user11.setEmail("N95@ppe.com");
    user11.setFirstName("Koji");
    user11.setLastName("Tsukihara");
    user11.setLocation("Braintree, MA");
    user11.setImageUrl("https://www.pngfind.com/pngs/m/372-3727240_why-do-japanese-people-wear-mask-.png");
    seedList.add(user11);

    User user12 = new User();
    user12.setUsername("SaudiBig");
    user12.setPassword("smartandnice");
    user12.setEmail("Alhambra12@marker.com");
    user12.setFirstName("Mohamed");
    user12.setLastName("Elibiali");
    user12.setLocation("Canton, MA");
    user12.setImageUrl("https://www.pngitem.com/pimgs/m/516-5164203_cute-arab-boy-cartoon-vector-character-aka-hanif.png");
    seedList.add(user12);

    User user13 = new User();
    user13.setUsername("ArchitectLe");
    user13.setPassword("doitbig123");
    user13.setEmail("gimmeDat@structures.com");
    user13.setFirstName("Martina");
    user13.setLastName("Al-Hawrahi");
    user13.setLocation("Cambridge, MA");
    user13.setImageUrl("https://i.pinimg.com/originals/e1/0d/dc/e10ddc5b26f48096cd4dd0ffc406c352.png");
    seedList.add(user13);

    User user14 = new User();
    user14.setUsername("Tiburon31");
    user14.setPassword("wordpass");
    user14.setEmail("Toiletboy@gwangetit.com");
    user14.setFirstName("Tom");
    user14.setLastName("Han");
    user14.setLocation("Quincy, MA");
    user14.setImageUrl("https://www.pngitem.com/pimgs/m/191-1910574_vector-child-cartoon-character-african-american-male-cartoon.png");
    seedList.add(user14);

    User user15 = new User();
    user15.setUsername("Mockingbird");
    user15.setPassword("mock12");
    user15.setEmail("Aima@shaim.com");
    user15.setFirstName("Aima");
    user15.setLastName("Aono");
    user15.setLocation("Brookline, MA");
    user15.setImageUrl("https://www.kindpng.com/picc/m/288-2884130_african-american-fitness-girl-cartoon-vector-character-african.png");
    seedList.add(user15);

    User user16 = new User();
    user16.setUsername("BizBeGood");
    user16.setPassword("hungryMan");
    user16.setEmail("DaMan123@Kweli.com");
    user16.setFirstName("Tom");
    user16.setLastName("Witherton");
    user16.setLocation("Newton, MA");
    user16.setImageUrl("https://www.pngkey.com/png/detail/28-286766_african-american-male-character-with-a-black-hair.png");
    seedList.add(user16);

    User user17 = new User();
    user17.setUsername("BigHair13");
    user17.setPassword("mikeTyson");
    user17.setEmail("Lola@bepoppin.com");
    user17.setFirstName("Lola");
    user17.setLastName("Cook");
    user17.setLocation("Milton, MA");
    user17.setImageUrl("https://i7.pngflow.com/pngimage/427/60/png-black-black-girls-cartoon-characters-first-explosion-african-girls-clipart.png");
    seedList.add(user17);

    User user18 = new User();
    user18.setUsername("MelanieMelanin");
    user18.setPassword("onefist");
    user18.setEmail("Melanie@bepoppin.com");
    user18.setFirstName("Melanie");
    user18.setLastName("Smit");
    user18.setLocation("Dorchester, MA");
    user18.setImageUrl("https://www.netclipart.com/pp/m/317-3175863_beautiful-black-anime-characters.png");
    seedList.add(user18);

    User user19 = new User();
    user19.setUsername("HairbeFine");
    user19.setPassword("mypriv");
    user19.setEmail("Karen@Whereisthemanager.com");
    user19.setFirstName("Karen");
    user19.setLastName("Smith");
    user19.setLocation("Dorchester, MA");
    user19.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSxakTWMVNA5H2NTurwKWILVqR2Jexsf6u2ykj8NGBSHYLCXzRk&usqp=CAU");
    seedList.add(user19);

    for (User user: seedList) {
      List<User> matchUsername = userRepository.findAllByUsername(user.getUsername());
      if (matchUsername.size() == 0) {
        userRepository.save(user);
      }
    }
  }

}
