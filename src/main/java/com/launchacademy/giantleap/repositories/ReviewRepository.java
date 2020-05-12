package com.launchacademy.giantleap.repositories;

import com.launchacademy.giantleap.models.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import org.springframework.data.repository.query.Param;

public interface ReviewRepository extends PagingAndSortingRepository<Review, Integer> {
    List<Review> findAll();

    @Query("SELECT r FROM Review r JOIN Station s on r.station = s.id WHERE s.id = :id")
    public  List<Review> findAllByStationId(@Param("id") Integer id);

}
