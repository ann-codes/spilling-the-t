package com.launchacademy.giantleap.seeders;

import com.launchacademy.giantleap.models.Review;
import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.repositories.ReviewRepository;
import com.launchacademy.giantleap.repositories.StationRepository;
import com.launchacademy.giantleap.repositories.UserRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class ReviewSeeder {
    private ReviewRepository reviewRepository;
    private StationRepository stationRepository;
    private UserRepository userRepository;

    @Autowired ReviewSeeder(ReviewRepository reviewRepository, StationRepository stationRepository, UserRepository userRepository) {
        this.reviewRepository = reviewRepository;
        this.stationRepository = stationRepository;
        this.userRepository = userRepository;
    }

    Date now = new Date();

    public void seed() {
        List<Review>reviews = new ArrayList<>();

        Review review = new Review();
        review.setTitle("Ashmont station elevator a porta-potty?!");
        review.setDate(now);
        review.setReview("As a universal accessibility advocate, I am appalled at the state of the station elevator. It smells like a urinal! It is a biohazard and NOT acceptable for any living creature to set foot in. This station is NOT accessibility-compliant whatsoever, avoid riding the elevator for your health and safety! P.S. to all you disgusting irresponsible law breakers: stop peeing in MBTA elevators!");
        review.setCleanliness(1);
        review.setOnTime(4);
        review.setCapacity(2);
        review.setOverallRating(1);
        review.setStation(stationRepository.findByName("Ashmont"));
        review.setUser(userRepository.findByUsername("loanshark"));
        reviews.add(review);

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review1);

        Review review2 = new Review();
        review2.setTitle("Fake marketing! Really disappointed customer!");
        review2.setDate(now);
        review2.setReview("I am a tourist and believed this destination was supposed to be a carnival or something marvelous. Instead, I discovered a run-down train station upon visiting. Why would they name it Wonderland if there's nothing wonderful about it. Shame on you, MBTA!");
        review2.setCleanliness(3);
        review2.setOnTime(3);
        review2.setCapacity(3);
        review2.setOverallRating(1);
        review2.setStation(stationRepository.findByName("Wonderland"));
        review2.setUser(userRepository.findByUsername("superGirl"));
        reviews.add(review2);

        Review review3 = new Review();
        review3.setTitle("Why am I even here?");
        review3.setDate(now);
        review3.setReview("I got off on stop, and it seemed ok, but then why did I come here? There's nothing interesting here.");
        review3.setCleanliness(5);
        review3.setOnTime(4);
        review3.setCapacity(5);
        review3.setOverallRating(5);
        review3.setStation(stationRepository.findByName("Shawmut"));
        review3.setUser(userRepository.findByUsername("FurSakes"));
        reviews.add(review3);

        Review review4 = new Review();
        review4.setTitle("I saw BSO Perform");
        review4.setDate(now);
        review4.setReview("Oh My Lord, it was amazing!  I got into station to leave and heard so many buskers playing classical muscial. Stravinsky for life!");
        review4.setCleanliness(3);
        review4.setOnTime(3);
        review4.setCapacity(3);
        review4.setOverallRating(1);
        review4.setStation(stationRepository.findByName("Symphony"));
        review4.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review4);

        Review review5 = new Review();
        review5.setTitle("Derailed");
        review5.setDate(now);
        review5.setReview("The train derailed. I got lucky, but apparently this is a thing with them. Station was clean from what I remember.");
        review5.setCleanliness(5);
        review5.setOnTime(4);
        review5.setCapacity(5);
        review5.setOverallRating(5);
        review5.setStation(stationRepository.findByName("Boston College"));
        review5.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review5);

        Review review6 = new Review();
        review6.setTitle("You think you better than me?!!!");
        review6.setDate(now);
        review6.setReview("Too many people or eggheads were on the train. I felt very irritated by their conversations. Also, station was pretty boring looking, but it didn't smell bad,");
        review6.setCleanliness(3);
        review6.setOnTime(3);
        review6.setCapacity(3);
        review6.setOverallRating(1);
        review6.setStation(stationRepository.findByName("Kendall/MIT"));
        review6.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review6);

        Review review7 = new Review();
        review7.setTitle("Ya take life for fun");
        review7.setDate(now);
        review7.setReview("Wow, this place is way different than the other side of the Red Line. I saw a person ask me for money and then used a section of the place like a toilet. Ew.");
        review7.setCleanliness(5);
        review7.setOnTime(4);
        review7.setCapacity(5);
        review7.setOverallRating(5);
        review7.setStation(stationRepository.findByName("Alewife"));
        review7.setUser(userRepository.findByUsername("PatoisPat"));
        reviews.add(review7);

        Review review8 = new Review();
        review8.setTitle("No Manager!!!");
        review8.setDate(now);
        review8.setReview("I am so grossed out by place. Too many people and they were so busy no one talked to me. I attempted to speak to manager, but they were flippant. I will bring this up to my friend hwo works at the T. Did I mention he's the Director?");
        review8.setCleanliness(3);
        review8.setOnTime(3);
        review8.setCapacity(3);
        review8.setOverallRating(1);
        review8.setStation(stationRepository.findByName("Ruggles"));
        review8.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review8);

        Review review9 = new Review();
        review9.setTitle("It was cool");
        review9.setDate(now);
        review9.setReview("I went there, it was busy, but man people were just fighting and peeing everywhere. I do not like this stop.");
        review9.setCleanliness(1);
        review9.setOnTime(3);
        review9.setCapacity(5);
        review9.setOverallRating(5);
        review9.setStation(stationRepository.findByName("Harvard"));
        review9.setUser(userRepository.findByUsername("MarleyMan"));
        reviews.add(review9);

        Review review10 = new Review();
        review10.setTitle("Awesome place, but design was terrible");
        review10.setDate(now);
        review10.setReview("I am a tourist and I love Donuts. I went to this stop and was accosted by too many people begging for money. But then I was helped by a great old lady. Then she robbed me.!");
        review10.setCleanliness(3);
        review10.setOnTime(4);
        review10.setCapacity(2);
        review10.setOverallRating(1);
        review10.setStation(stationRepository.findByName("Symphony"));
        review10.setUser(userRepository.findByUsername("ShanghaiHi"));
        reviews.add(review10);

        Review review11 = new Review();
        review11.setTitle("My wife had a baby at the stop!");
        review11.setDate(now);
        review11.setReview("We tried to make it to the Hospital, but then my wife dilated too much and the baby came right at the stop. People were not happy the mess, but we named our baby Charles");
        review11.setCleanliness(5);
        review11.setOnTime(4);
        review11.setCapacity(5);
        review11.setOverallRating(5);
        review11.setStation(stationRepository.findByName("Charles/MGH"));
        review11.setUser(userRepository.findByUsername("SapporoMan"));
        reviews.add(review11);

        Review review12 = new Review();
        review12.setTitle("Smart, yet fun");
        review12.setDate(now);
        review12.setReview("It was quiet yet fun, its indoors and took awhile to head out, but it was a good stop.");
        review12.setCleanliness(3);
        review12.setOnTime(3);
        review12.setCapacity(3);
        review12.setOverallRating(1);
        review12.setStation(stationRepository.findByName("Harvard"));
        review12.setUser(userRepository.findByUsername("SaudiBig"));
        reviews.add(review12);

        Review review13 = new Review();
        review13.setTitle("Get your degree today!");
        review13.setDate(now);
        review13.setReview("I just walked out of station and they gave me a degree, it was great!");
        review13.setCleanliness(5);
        review13.setOnTime(4);
        review13.setCapacity(5);
        review13.setOverallRating(5);
        review13.setStation(stationRepository.findByName("Community College"));
        review13.setUser(userRepository.findByUsername("ArchitectLe"));
        reviews.add(review13);

        Review review14 = new Review();
        review14.setTitle("Fake marketing! Really disappointed customer!");
        review14.setDate(now);
        review14.setReview("I am a tourist and believed this destination was supposed to be a carnival or something marvelous. Instead, I discovered a run-down train station upon visiting. Why would they name it Wonderland if there's nothing wonderful about it. Shame on you, MBTA!");
        review14.setCleanliness(3);
        review14.setOnTime(3);
        review14.setCapacity(3);
        review14.setOverallRating(1);
        review14.setStation(stationRepository.findByName("Symphony"));
        review14.setUser(userRepository.findByUsername("Tiburon31"));
        reviews.add(review14);

        Review review15 = new Review();
        review15.setTitle("More like Echmere");
        review15.setDate(now);
        review15.setReview("It was small, smoggy, and peole were gross.");
        review15.setCleanliness(1);
        review15.setOnTime(2);
        review15.setCapacity(5);
        review15.setOverallRating(5);
        review15.setStation(stationRepository.findByName("Lechmere"));
        review15.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review15);

        Review review16 = new Review();
        review16.setTitle("Fake marketing! Really disappointed customer!");
        review16.setDate(now);
        review16.setReview("Went to work and the attendants were helpful. I liked how they were able to help me find Eataly. (Such good pasta!)");
        review16.setCleanliness(4);
        review16.setOnTime(4);
        review16.setCapacity(3);
        review16.setOverallRating(1);
        review16.setStation(stationRepository.findByName("Back Bay"));
        review16.setUser(userRepository.findByUsername("Mockingbird"));
        reviews.add(review16);

        Review review17 = new Review();
        review17.setTitle("No seats, but quick");
        review17.setDate(now);
        review17.setReview("I loved how the station was covered and people were looking forward to a good day. No Space so make sure you find a seat.");
        review17.setCleanliness(5);
        review17.setOnTime(4);
        review17.setCapacity(5);
        review17.setOverallRating(5);
        review17.setStation(stationRepository.findByName("Arlington"));
        review17.setUser(userRepository.findByUsername("BizBeGood"));
        reviews.add(review17);

        Review review18 = new Review();
        review18.setTitle("I loved the station");
        review18.setDate(now);
        review18.setReview("Happy and fun, the crowd was excited about game today!");
        review18.setCleanliness(3);
        review18.setOnTime(3);
        review18.setCapacity(3);
        review18.setOverallRating(1);
        review18.setStation(stationRepository.findByName("Fenway"));
        review18.setUser(userRepository.findByUsername("BigHair13"));
        reviews.add(review18);

        Review review19 = new Review();
        review19.setTitle("Quiet and I loved it");
        review19.setDate(now);
        review19.setReview("I felt so serene here, the station was very isolated, but it was great and felt otherwordly");
        review19.setCleanliness(5);
        review19.setOnTime(4);
        review19.setCapacity(5);
        review19.setOverallRating(5);
        review19.setStation(stationRepository.findByName("Wood Island"));
        review19.setUser(userRepository.findByUsername("MelanieMelanin"));
        reviews.add(review19);

        Review review20 = new Review();
        review20.setTitle("So great and on time");
        review20.setDate(now);
        review20.setReview("I liked it. But then people were bothering me to protest blah blah injustice. No managers in sight. *sigh*");
        review20.setCleanliness(3);
        review20.setOnTime(3);
        review20.setCapacity(3);
        review20.setOverallRating(1);
        review20.setStation(stationRepository.findByName("Arlington"));
        review20.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review20);

        Review review21 = new Review();
        review21.setTitle("Where was the Stadium");
        review21.setDate(now);
        review21.setReview("Do you know how far the the stadium is from this stop?  I was so mad I had to walk, I skipped the Popeye's chicken sandwich and went to speak to the Manager.");
        review21.setCleanliness(5);
        review21.setOnTime(3);
        review21.setCapacity(5);
        review21.setOverallRating(5);
        review21.setStation(stationRepository.findByName("Fenway"));
        review21.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review21);

        Review review22 = new Review();
        review22.setTitle("I was all about this station");
        review22.setDate(now);
        review22.setReview("Beautiful spot. But it started raining and I ran to vist musuem.");
        review22.setCleanliness(3);
        review22.setOnTime(3);
        review22.setCapacity(3);
        review22.setOverallRating(1);
        review22.setStation(stationRepository.findByName("Museum of Fine Arts"));
        review22.setUser(userRepository.findByUsername("superGirl"));
        reviews.add(review22);

        Review review23 = new Review();
        review23.setTitle("Oh but you let him in");
        review23.setDate(now);
        review23.setReview("Experience so bad commented twice, they truly are mean here. I am the victim!");
        review23.setCleanliness(2);
        review23.setOnTime(1);
        review23.setCapacity(5);
        review23.setOverallRating(5);
        review23.setStation(stationRepository.findByName("Prudential"));
        review23.setUser(userRepository.findByUsername("BigHair13"));
        reviews.add(review23);

        Review review24 = new Review();
        review24.setTitle("Who do they think they are?");
        review24.setDate(now);
        review24.setReview("God help you if you go to the wrong part to go up to Prudential, it takes awhile to find the elevator. I went to discuss with manager, but she told me to mind my business. EXCUSE ME?!! WHERE IS YOUR MANAGER?!!");
        review24.setCleanliness(2);
        review24.setOnTime(1);
        review24.setCapacity(3);
        review24.setOverallRating(1);
        review24.setStation(stationRepository.findByName("Prudential"));
        review24.setUser(userRepository.findByUsername("BigHair13"));
        reviews.add(review24);

        Review review25 = new Review();
        review25.setTitle("This my spot");
        review25.setDate(now);
        review25.setReview("Smelled great and the people were kind. But then I go to MIT so I'm biased.");
        review25.setCleanliness(5);
        review25.setOnTime(4);
        review25.setCapacity(5);
        review25.setOverallRating(5);
        review25.setStation(stationRepository.findByName("Kendall/MIT"));
        review25.setUser(userRepository.findByUsername("MelanieMelanin"));
        reviews.add(review25);

        Review review26 = new Review();
        review26.setTitle("1,210,600 minutes. too long.");
        review26.setDate(now);
        review26.setReview("People started singing at stop. This was really irritating.");
        review26.setCleanliness(3);
        review26.setOnTime(1);
        review26.setCapacity(3);
        review26.setOverallRating(1);
        review26.setStation(stationRepository.findByName("Ruggles"));
        review26.setUser(userRepository.findByUsername("MelanieMelanin"));
        reviews.add(review26);

        Review review27 = new Review();
        review27.setTitle("Baby you're a firework!");
        review27.setDate(now);
        review27.setReview("It was a cool crowd. We saw fireworks and laughed at love.");
        review27.setCleanliness(5);
        review27.setOnTime(4);
        review27.setCapacity(5);
        review27.setOverallRating(5);
        review27.setStation(stationRepository.findByName("Sullivan Square"));
        review27.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review27);

        Review review28 = new Review();
        review28.setTitle("No. Just NO.");
        review28.setDate(now);
        review28.setReview(" Trader Joes didn't have wine, why even go there?!! MBTA attendant yelled at me to pay my fare, but I skipped over");
        review28.setCleanliness(3);
        review28.setOnTime(3);
        review28.setCapacity(3);
        review28.setOverallRating(1);
        review28.setStation(stationRepository.findByName("Sullivan Square"));
        review28.setUser(userRepository.findByUsername("superGirl"));
        reviews.add(review28);

        Review review29 = new Review();
        review29.setTitle("Early bird gets a seat!");
        review29.setDate(now);
        review29.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review29.setCleanliness(5);
        review29.setOnTime(4);
        review29.setCapacity(5);
        review29.setOverallRating(5);
        review29.setStation(stationRepository.findByName("Arlington"));
        review29.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review29);

        Review review30 = new Review();
        review30.setTitle("Fake marketing! Really disappointed customer!");
        review30.setDate(now);
        review30.setReview("I am a tourist and believed this destination was supposed to be a carnival or something marvelous. Instead, I discovered a run-down train station upon visiting. Why would they name it Wonderland if there's nothing wonderful about it. Shame on you, MBTA!");
        review30.setCleanliness(3);
        review30.setOnTime(3);
        review30.setCapacity(3);
        review30.setOverallRating(1);
        review30.setStation(stationRepository.findByName("Lechmere"));
        review30.setUser(userRepository.findByUsername("superGirl"));
        reviews.add(review30);

        Review review31 = new Review();
        review31.setTitle("Early bird gets a seat!");
        review31.setDate(now);
        review31.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review31.setCleanliness(5);
        review31.setOnTime(4);
        review31.setCapacity(5);
        review31.setOverallRating(5);
        review31.setStation(stationRepository.findByName("Lechmere"));
        review31.setUser(userRepository.findByUsername("lazycat2001"));
        reviews.add(review31);

        Review review32 = new Review();
        review32.setTitle("Fake marketing! Really disappointed customer! WHERE IS THE MANAGER");
        review32.setDate(now);
        review32.setReview("I am a tourist and believed this destination was supposed to be a carnival or something marvelous. Instead, I discovered a run-down train station upon visiting. Why would they name it Wonderland if there's nothing wonderful about it. Shame on you, MBTA!");
        review32.setCleanliness(3);
        review32.setOnTime(3);
        review32.setCapacity(3);
        review32.setOverallRating(1);
        review32.setStation(stationRepository.findByName("Wonderland"));
        review32.setUser(userRepository.findByUsername("HairbeFine"));
        reviews.add(review32);

        if (reviewRepository.count() == 0) {
            for (Review reviewa : reviews) {
                reviewRepository.save(reviewa);
            }
        }
    }
}
