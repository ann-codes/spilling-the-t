package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.models.Review;
import com.launchacademy.giantleap.repositories.ReviewRepository;
import com.launchacademy.giantleap.repositories.StationRepository;
import com.launchacademy.giantleap.repositories.UserRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ReviewApiController {
    private ReviewRepository reviewRepository;
    private UserRepository userRepository;
    private StationRepository stationRepository;

    @Autowired
    public ReviewApiController(ReviewRepository reviewRepository, UserRepository userRepository, StationRepository stationRepository) {
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.stationRepository = stationRepository;
    }

    @NoArgsConstructor
    private class NotFoundException extends RuntimeException {}

    @ControllerAdvice
    private class NotFoundAdvice {
        @ResponseBody
        @ExceptionHandler(NotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String NotFoundHandler(NotFoundException ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("reviews/all")
    public Iterable<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
    
}
