package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.dtos.UserDto;
import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.models.User;
import com.launchacademy.giantleap.repositories.StationRepository;
import com.launchacademy.giantleap.repositories.UserRepository;
import com.launchacademy.giantleap.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StationApiController {
    private StationRepository stationRepository;

    @Autowired
    public StationApiController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @GetMapping("/stations/all")
    public Iterable<Station> getAllStations() {
        return stationRepository.findAll();
    }

    @PostMapping("/stations/new")
    public ResponseEntity create(@Valid @RequestBody Station station, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.NOT_ACCEPTABLE);
        } else {
            return new ResponseEntity<Station>(stationRepository.save(station), HttpStatus.CREATED);
        }
    }
}