package com.launchacademy.giantleap.seeders;

import com.launchacademy.giantleap.models.Station;
import com.launchacademy.giantleap.repositories.StationRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StationsSeeder {

  private StationRepository stationRepo;

  @Autowired
  public StationsSeeder(StationRepository stationRepo) {
    this.stationRepo = stationRepo;
  }

  public void seed() {
    List<Station> stations = new ArrayList<Station>();

    Station stationA = new Station();
    stationA.setNetwork("MBTA");
    stationA.setName("Ashmont");
    stationA.setLineName("Red");
    stationA.setAddress("1900 Dorchester Avenue");
    stationA.setCity("Boston");
    stationA.setState("MA");
    stationA.setZip("02124");
    stationA.setCountry("USA");
    stationA.setImageUrl(
        "https://15nf7a18dqjx1t68xnzfiv18-wpengine.netdna-ssl.com/wp-content/uploads/2018/09/MBTA-Ashmont-Hero-06.jpg");
    stationA.setDescription(
        "Covered outdoor Stop in Dorchester Neighborhood, last southern stop on Red Line T before Trolley");
    stationA.setCalculatedCost("Fare");
    stationA.setAdminApproved(true);
    stations.add(stationA);

    Station stationB = new Station();
    stationB.setNetwork("MBTA");
    stationB.setLineName("Orange");
    stationB.setName("Stony Brook");
    stationB.setAddress("100 Boylston Avenue");
    stationB.setCity("Boston");
    stationB.setState("MA");
    stationB.setZip("02130");
    stationB.setCountry("USA");
    stationB.setImageUrl("https://s3-media0.fl.yelpcdn.com/bphoto/Mrg7gZbymTfdI7KXQeVqYQ/l.jpg");
    stationB.setDescription(
        "Outdoor covered train stop in Jamaica Plain residential neighborhood, Orange Line T");
    stationB.setCalculatedCost("Fare");
    stationB.setAdminApproved(true);
    stations.add(stationB);

    Station stationC = new Station();
    stationC.setNetwork("MBTA");
    stationC.setLineName("Blue");
    stationC.setName("Wonderland");
    stationC.setAddress("1300 North Shore Road");
    stationC.setCity("Revere");
    stationC.setState("MA");
    stationC.setZip("02151");
    stationC.setCountry("USA");
    stationC.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationC.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationC.setCalculatedCost("Fare");
    stationC.setAdminApproved(true);
    stations.add(stationC);

    if (stationRepo.count() == 0) {
      for (Station station : stations) {
        stationRepo.save(station);
      }
    }
  }
}
