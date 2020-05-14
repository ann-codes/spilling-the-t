package com.launchacademy.giantleap.seeders;

import com.launchacademy.giantleap.models.Review;
import com.launchacademy.giantleap.repositories.ReviewRepository;
import com.launchacademy.giantleap.repositories.StationRepository;
import com.launchacademy.giantleap.repositories.UserRepository;
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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));


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

        Review review1 = new Review();
        review1.setTitle("Early bird gets a seat!");
        review1.setDate(now);
        review1.setReview("Do you want to know the secret to life in the city? Get yourself a place near the end of a subway line--always guaranteed a seat if you get on at the first stop on a route! I bring my own Lysol and hose down my seat first thing, extra sterile and comfortable.");
        review1.setCleanliness(5);
        review1.setOnTime(4);
        review1.setCapacity(5);
        review1.setOverallRating(5);
        review1.setStation(stationRepository.findByName("Ashmont"));
        review1.setUser(userRepository.findByUsername("coolcat2001"));

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

        List<Review> findReview = reviewRepository.findAll();
        if (findReview.size() == 0) {
            reviewRepository.save(review);
            reviewRepository.save(review1);
            reviewRepository.save(review2);
        }
    }
}
