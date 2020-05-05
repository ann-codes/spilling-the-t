package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.repositories.StationRepository;

import java.util.List;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class StationApiController {
    private StationRepository stationRepository;

    @Autowired
    public StationApiController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @NoArgsConstructor
    private class StationNotFoundException extends RuntimeException {
        @ResponseBody
        @ExceptionHandler(StationNotFoundException.class)
        @ResponseStatus(HttpStatus.NOT_FOUND)
        String stationNotFoundHandler(StationNotFoundException ex) {
            return ex.getMessage();
        }
    }

    @GetMapping("/stations/all")
    public Iterable<Station> getAllStations() {
        return stationRepository.findAll();
    }

    @GetMapping("/station/{id}")
    public Station getOneType(@PathVariable Integer id) {
        return stationRepository.findById(id).orElseThrow(StationNotFoundException::new);
    }

    @PostMapping("/stations/new")
    public ResponseEntity create(@RequestBody @Valid Station station, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.NOT_ACCEPTABLE);
        } else {
            return new ResponseEntity<Station>(stationRepository.save(station), HttpStatus.CREATED);
        }
    }
}