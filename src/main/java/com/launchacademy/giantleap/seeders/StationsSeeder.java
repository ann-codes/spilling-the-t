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

    Station stationD = new Station();
    stationD.setNetwork("MBTA");
    stationD.setLineName("Blue");
    stationD.setName("Wonderland");
    stationD.setAddress("1300 North Shore Road");
    stationD.setCity("Revere");
    stationD.setState("MA");
    stationD.setZip("02151");
    stationD.setCountry("USA");
    stationD.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationD.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationD.setCalculatedCost("Fare");
    stationD.setAdminApproved(true);
    stations.add(stationD);

    Station stationE = new Station();
    stationE.setNetwork("MBTA");
    stationE.setName("Back Bay");
    stationE.setLineName("Orange");
    stationE.setAddress("145 Dartmouth St ");
    stationE.setCity("Boston");
    stationE.setState("MA");
    stationE.setZip("02116");
    stationE.setCountry("USA");
    stationE.setImageUrl(
        "https://cdn.mbta.com/images/stops/back_bay.jpg");
    stationE.setDescription(
        "In Back Bay-South End Neighborhood, Also Amtrak and Commuter Stop");
    stationE.setCalculatedCost("Fare");
    stationE.setAdminApproved(true);
    stations.add(stationE);

    Station stationF = new Station();
    stationF.setNetwork("MBTA");
    stationF.setLineName("Orange");
    stationF.setName("Ruggles");
    stationF.setAddress("1150 Tremont St");
    stationF.setCity("Boston");
    stationF.setState("MA");
    stationF.setZip("02120");
    stationF.setCountry("USA");
    stationF.setImageUrl("https://huntnewsnu.com/wp-content/uploads/2019/09/ruggles-900x600.jpg");
    stationF.setDescription(
        "Train stop in Roxbury neighborhood, Orange Line T near Northeastern University");
    stationF.setCalculatedCost("Fare");
    stationF.setAdminApproved(true);
    stations.add(stationF);

    Station stationG = new Station();
    stationG.setNetwork("MBTA");
    stationG.setLineName("Orange");
    stationG.setName("Community College");
    stationG.setAddress("Austin St and Rutherford Ave");
    stationG.setCity("Charlestown");
    stationG.setState("MA");
    stationG.setZip("02129");
    stationG.setCountry("USA");
    stationG.setImageUrl("https://s3-media0.fl.yelpcdn.com/bphoto/8DVQPmx8AP61Mrm41wXp9Q/o.jpg");
    stationG.setDescription("Covered outdoor next to Bunker Hill Memorial in Charlestown Neighborhood");
    stationG.setCalculatedCost("Fare");
    stationG.setAdminApproved(true);
    stations.add(stationG);

    Station stationH = new Station();
    stationH.setNetwork("MBTA");
    stationH.setLineName("Orange");
    stationH.setName("Sullivan Square");
    stationH.setAddress("Maffa Way and Cambridge St");
    stationH.setCity("Charlestown");
    stationH.setState("MA");
    stationH.setZip("02129");
    stationH.setCountry("USA");
    stationH.setImageUrl("https://subwaynut.com/mbta/orange_line/sullivan_square/sullivan_square4.jpg");
    stationH.setDescription("Covered outdoor in Charlestown Neighborhood");
    stationH.setCalculatedCost("Fare");
    stationH.setAdminApproved(true);
    stations.add(stationH);

    Station stationI = new Station();
    stationI.setNetwork("MBTA");
    stationI.setName("Harvard");
    stationI.setLineName("Red");
    stationI.setAddress("1400 Massachusetts Ave");
    stationI.setCity("Cambridge");
    stationI.setState("MA");
    stationI.setZip("02138");
    stationI.setCountry("USA");
    stationI.setImageUrl(
        "https://www.subwaynut.com/mbta/red_line/harvard/harvard3.jpg");
    stationI.setDescription(
        "Covered outdoor Stop in Dorchester Neighborhood, last southern stop on Red Line T before Trolley");
    stationI.setCalculatedCost("Fare");
    stationI.setAdminApproved(true);
    stations.add(stationI);

    Station stationJ = new Station();
    stationJ.setNetwork("MBTA");
    stationJ.setLineName("Red");
    stationJ.setName("Savin Hill");
    stationJ.setAddress("100 Boylston Avenue");
    stationJ.setCity("Boston");
    stationJ.setState("MA");
    stationJ.setZip("02130");
    stationJ.setCountry("USA");
    stationJ.setImageUrl("https://s3-media0.fl.yelpcdn.com/bphoto/Mrg7gZbymTfdI7KXQeVqYQ/l.jpg");
    stationJ.setDescription(
        "Outdoor covered train stop in Jamaica Plain residential neighborhood, Orange Line T");
    stationJ.setCalculatedCost("Fare");
    stationJ.setAdminApproved(true);
    stations.add(stationJ);

    Station stationK = new Station();
    stationK.setNetwork("MBTA");
    stationK.setLineName("Red");
    stationK.setName("Central/MIT");
    stationK.setAddress("1300 North Shore Road");
    stationK.setCity("Revere");
    stationK.setState("MA");
    stationK.setZip("02151");
    stationK.setCountry("USA");
    stationK.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationK.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationK.setCalculatedCost("Fare");
    stationK.setAdminApproved(true);
    stations.add(stationK);

    Station stationL = new Station();
    stationL.setNetwork("MBTA");
    stationL.setLineName("Red");
    stationL.setName("Alewife");
    stationL.setAddress("1300 North Shore Road");
    stationL.setCity("Revere");
    stationL.setState("MA");
    stationL.setZip("02151");
    stationL.setCountry("USA");
    stationL.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationL.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationL.setCalculatedCost("Fare");
    stationL.setAdminApproved(true);
    stations.add(stationL);

    Station stationM = new Station();
    stationM.setNetwork("MBTA");
    stationM.setName("Charles/MGH");
    stationM.setLineName("Red");
    stationM.setAddress("1900 Dorchester Avenue");
    stationM.setCity("Boston");
    stationM.setState("MA");
    stationM.setZip("02124");
    stationM.setCountry("USA");
    stationM.setImageUrl(
        "https://15nf7a18dqjx1t68xnzfiv18-wpengine.netdna-ssl.com/wp-content/uploads/2018/09/MBTA-Ashmont-Hero-06.jpg");
    stationM.setDescription(
        "Covered outdoor Stop in Dorchester Neighborhood, last southern stop on Red Line T before Trolley");
    stationM.setCalculatedCost("Fare");
    stationM.setAdminApproved(true);
    stations.add(stationM);

    Station stationN = new Station();
    stationN.setNetwork("MBTA");
    stationN.setLineName("Green");
    stationN.setName("Stony Brook");
    stationN.setAddress("100 Boylston Avenue");
    stationN.setCity("Boston");
    stationN.setState("MA");
    stationN.setZip("02130");
    stationN.setCountry("USA");
    stationN.setImageUrl("https://s3-media0.fl.yelpcdn.com/bphoto/Mrg7gZbymTfdI7KXQeVqYQ/l.jpg");
    stationN.setDescription(
        "Outdoor covered train stop in Jamaica Plain residential neighborhood, Orange Line T");
    stationN.setCalculatedCost("Fare");
    stationN.setAdminApproved(true);
    stations.add(stationN);

    Station stationO = new Station();
    stationO.setNetwork("MBTA");
    stationO.setLineName("Green");
    stationO.setName("Wonderland");
    stationO.setAddress("1300 North Shore Road");
    stationO.setCity("Revere");
    stationO.setState("MA");
    stationO.setZip("02151");
    stationO.setCountry("USA");
    stationO.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationO.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationO.setCalculatedCost("Fare");
    stationO.setAdminApproved(true);
    stations.add(stationO);

    Station stationP = new Station();
    stationP.setNetwork("MBTA");
    stationP.setLineName("Green");
    stationP.setName("Boston College");
    stationP.setAddress("1300 North Shore Road");
    stationP.setCity("Revere");
    stationP.setState("MA");
    stationP.setZip("02151");
    stationP.setCountry("USA");
    stationP.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationP.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationP.setCalculatedCost("Fare");
    stationP.setAdminApproved(true);
    stations.add(stationP);

    Station stationQ = new Station();
    stationQ.setNetwork("MBTA");
    stationQ.setName("Prudential");
    stationQ.setLineName("Green");
    stationQ.setAddress("1900 Dorchester Avenue");
    stationQ.setCity("Boston");
    stationQ.setState("MA");
    stationQ.setZip("02124");
    stationQ.setCountry("USA");
    stationQ.setImageUrl(
        "https://15nf7a18dqjx1t68xnzfiv18-wpengine.netdna-ssl.com/wp-content/uploads/2018/09/MBTA-Ashmont-Hero-06.jpg");
    stationQ.setDescription(
        "Covered outdoor Stop in Dorchester Neighborhood, last southern stop on Red Line T before Trolley");
    stationQ.setCalculatedCost("Fare");
    stationQ.setAdminApproved(true);
    stations.add(stationQ);

    Station stationR = new Station();
    stationR.setNetwork("MBTA");
    stationR.setLineName("Green");
    stationR.setName("Musuem of Fine Arts");
    stationR.setAddress("100 Boylston Avenue");
    stationR.setCity("Boston");
    stationR.setState("MA");
    stationR.setZip("02130");
    stationR.setCountry("USA");
    stationR.setImageUrl("https://s3-media0.fl.yelpcdn.com/bphoto/Mrg7gZbymTfdI7KXQeVqYQ/l.jpg");
    stationR.setDescription(
        "Outdoor covered train stop in Jamaica Plain residential neighborhood, Orange Line T");
    stationR.setCalculatedCost("Fare");
    stationR.setAdminApproved(true);
    stations.add(stationR);

    Station stationS = new Station();
    stationS.setNetwork("MBTA");
    stationS.setLineName("Green");
    stationS.setName("Arlington");
    stationS.setAddress("1300 North Shore Road");
    stationS.setCity("Revere");
    stationS.setState("MA");
    stationS.setZip("02151");
    stationS.setCountry("USA");
    stationS.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationS.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationS.setCalculatedCost("Fare");
    stationS.setAdminApproved(true);
    stations.add(stationS);

    Station stationT = new Station();
    stationT.setNetwork("MBTA");
    stationT.setLineName("Green");
    stationT.setName("Lechmere");
    stationT.setAddress("1300 North Shore Road");
    stationT.setCity("Revere");
    stationT.setState("MA");
    stationT.setZip("02151");
    stationT.setCountry("USA");
    stationT.setImageUrl("https://www.arrowstreet.com/wp-content/uploads/2015/03/01_1202_130730__Wonderland_MBTA-Edit_GreggShupe-1400x932.jpg");
    stationT.setDescription("Covered outdoor next to Revere Beach, Last stop on Blue Line T");
    stationT.setCalculatedCost("Fare");
    stationT.setAdminApproved(true);
    stations.add(stationT);

    if (stationRepo.count() == 0) {
      for (Station station : stations) {
        stationRepo.save(station);
      }
    }
  }
}
