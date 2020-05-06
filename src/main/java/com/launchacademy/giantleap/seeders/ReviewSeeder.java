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

        List<Review> findReview = reviewRepository.findAll();
        if (findReview.size() == 0) {
            reviewRepository.save(review);
        }
    }
}
