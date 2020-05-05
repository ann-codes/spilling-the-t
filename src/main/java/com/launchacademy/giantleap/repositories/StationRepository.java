package com.launchacademy.giantleap.repositories;

import com.launchacademy.giantleap.models.Station;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends PagingAndSortingRepository<Station, Integer> {

}
