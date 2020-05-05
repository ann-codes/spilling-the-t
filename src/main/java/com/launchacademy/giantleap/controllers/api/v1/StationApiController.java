package com.launchacademy.giantleap.controllers.api.v1;

import com.launchacademy.giantleap.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StationApiController {
@Autowired
  private StationRepository stationRepo;
}
