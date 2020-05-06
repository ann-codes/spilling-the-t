package com.launchacademy.giantleap.repositories;

import com.launchacademy.giantleap.models.Review;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Integer> {
    List<Review> findAll();
}
