package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.repositories.StationRepository;
import java.util.List;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationApiController {
@Autowired
  private StationRepository stationRepo;

@NoArgsConstructor
  private static class StationNotFoundException extends RuntimeException{

}

@ControllerAdvice
  private class StationNotFoundAdvice{

  @ResponseBody
  @ExceptionHandler(StationNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String stationNotFoundHandler(StationNotFoundException ex) {return ex.getMessage();}
}

@GetMapping("/api/v1/stations")
  public List getStations() {
  return stationRepo.findAll();
}

@GetMapping("/api/v1/stations/{id}")
public Station getOneType(@PathVariable Integer id){
  return stationRepo.findById(id).orElseThrow(StationNotFoundException:: new);
  }
}
