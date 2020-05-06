package com.launchacademy.giantleap.repositories;

import com.launchacademy.giantleap.models.Station;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends PagingAndSortingRepository<Station, Integer> {
  public List<Station> findAll();
  public Optional<Station> findById(Integer id);
  public Station findByName(String name);
}
