package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
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
    public String createStation(@ModelAttribute Station station, Model model) {
        model.addAttribute(station);
        return "trips/show";
    }
}