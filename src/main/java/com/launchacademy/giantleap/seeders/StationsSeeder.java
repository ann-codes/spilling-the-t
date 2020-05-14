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
    stationD.setName("Wood Island");
    stationD.setAddress("450 Bennington St");
    stationD.setCity("Boston");
    stationD.setState("MA");
    stationD.setZip("02128");
    stationD.setCountry("USA");
    stationD.setImageUrl("https://i.ytimg.com/vi/HWjW6zLFfHw/maxresdefault.jpg");
    stationD.setDescription("Covered outdoor on Blue Line T");
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
    stationJ.setName("Shawmut");
    stationJ.setAddress("Dayton St and Clementine Park");
    stationJ.setCity("Dorchester");
    stationJ.setState("MA");
    stationJ.setZip("02124");
    stationJ.setCountry("USA");
    stationJ.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSIe0EmHE6UsM8omax9svd8sQqisCby3xnNFF-eP2FPZonCSPaU&usqp=CAU");
    stationJ.setDescription(
        "Train stop on Red Line in Dorchester Neighborhood");
    stationJ.setCalculatedCost("Fare");
    stationJ.setAdminApproved(true);
    stations.add(stationJ);

    Station stationK = new Station();
    stationK.setNetwork("MBTA");
    stationK.setLineName("Red");
    stationK.setName("Kendall/MIT");
    stationK.setAddress("300 Main St");
    stationK.setCity("Cambridge");
    stationK.setState("MA");
    stationK.setZip("02142");
    stationK.setCountry("USA");
    stationK.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ8SMyM2FTR4tABozW0-2Y5N3DyNrcGtv78eH1Xa_rn9Q1fne4c&usqp=CAU");
    stationK.setDescription("Indoor station next to MIT");
    stationK.setCalculatedCost("Fare");
    stationK.setAdminApproved(true);
    stations.add(stationK);

    Station stationL = new Station();
    stationL.setNetwork("MBTA");
    stationL.setLineName("Red");
    stationL.setName("Alewife");
    stationL.setAddress("Alewife Brook Pkwy and Cambridge Park Dr");
    stationL.setCity("Cambridge");
    stationL.setState("MA");
    stationL.setZip("02140");
    stationL.setCountry("USA");
    stationL.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcT9Sdfy1w3cdqOf_eGLgDRBAT37yrru7BNXQk7vHs7y1P6gEVkH&usqp=CAU");
    stationL.setDescription("Indoor Station, Last stop on Red Line T");
    stationL.setCalculatedCost("Fare");
    stationL.setAdminApproved(true);
    stations.add(stationL);

    Station stationM = new Station();
    stationM.setNetwork("MBTA");
    stationM.setName("Charles/MGH");
    stationM.setLineName("Red");
    stationM.setAddress("426 Longfellow Bridge ");
    stationM.setCity("Boston");
    stationM.setState("MA");
    stationM.setZip("02114");
    stationM.setCountry("USA");
    stationM.setImageUrl(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQ5pBQnuJ0Dc1_SRwtuYXDLNn2qkYE41ZduCjwQ2iD7XWC15hpi&usqp=CAU");
    stationM.setDescription(
        "Covered outdoor Stop in Boston, next to Massachusetts General Hospital");
    stationM.setCalculatedCost("Fare");
    stationM.setAdminApproved(true);
    stations.add(stationM);

    Station stationN = new Station();
    stationN.setNetwork("MBTA");
    stationN.setLineName("Green");
    stationN.setName("Symphony");
    stationN.setAddress("Massachusetts Ave and Huntington Ave");
    stationN.setCity("Boston");
    stationN.setState("MA");
    stationN.setZip("02115");
    stationN.setCountry("USA");
    stationN.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQaD7Usjg_4Zowfr7JnTg9P6dux0BEU8eLoPDdH_6b6FHRrcWpw&usqp=CAU");
    stationN.setDescription(
        "Covered train stop on Green Line T");
    stationN.setCalculatedCost("Fare");
    stationN.setAdminApproved(true);
    stations.add(stationN);

    Station stationO = new Station();
    stationO.setNetwork("MBTA");
    stationO.setLineName("Green");
    stationO.setName("Fenway");
    stationO.setAddress("411 Park Dr");
    stationO.setCity("Boston");
    stationO.setState("MA");
    stationO.setZip("02215");
    stationO.setCountry("USA");
    stationO.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTPKWsfekZcuxM-5R3xKsYLXzoa1IsIK97s2Mp1DHiWftfh6FnP&usqp=CAU");
    stationO.setDescription("Outdoor stop in Fenway neighborhood");
    stationO.setCalculatedCost("Fare");
    stationO.setAdminApproved(true);
    stations.add(stationO);

    Station stationP = new Station();
    stationP.setNetwork("MBTA");
    stationP.setLineName("Green");
    stationP.setName("Boston College");
    stationP.setAddress("Commonwealth Ave and Lake St");
    stationP.setCity("Boston");
    stationP.setState("MA");
    stationP.setZip("02135");
    stationP.setCountry("USA");
    stationP.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSZ8lLLMTynGrzavxBjXw_SpgyXRXaRyE3xeW_PlcNzTu9amsH4&usqp=CAU");
    stationP.setDescription("Outdoor stop next to Boston College on Green Line T");
    stationP.setCalculatedCost("Fare");
    stationP.setAdminApproved(true);
    stations.add(stationP);

    Station stationQ = new Station();
    stationQ.setNetwork("MBTA");
    stationQ.setName("Prudential");
    stationQ.setLineName("Green");
    stationQ.setAddress("Huntington Ave and Belvidere St");
    stationQ.setCity("Boston");
    stationQ.setState("MA");
    stationQ.setZip("02199");
    stationQ.setCountry("USA");
    stationQ.setImageUrl(
        "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRiwZumL9vvy3RU5g39Lez1UC-IxG9S_xa_U1fTAujWFO6WwsLo&usqp=CAU");
    stationQ.setDescription(
        "Covered underground Stop in Back Bay Neighborhood, near Prudential Shopping Center");
    stationQ.setCalculatedCost("Fare");
    stationQ.setAdminApproved(true);
    stations.add(stationQ);

    Station stationR = new Station();
    stationR.setNetwork("MBTA");
    stationR.setLineName("Green");
    stationR.setName("Museum of Fine Arts");
    stationR.setAddress("Huntington Ave and Ruggles St");
    stationR.setCity("Boston");
    stationR.setState("MA");
    stationR.setZip("02115");
    stationR.setCountry("USA");
    stationR.setImageUrl("https://live.staticflickr.com/6034/6278688329_3431254631_b.jpg");
    stationR.setDescription(
        "Outdoor train stop in Fennway neighborhood, Green Line T");
    stationR.setCalculatedCost("Fare");
    stationR.setAdminApproved(true);
    stations.add(stationR);

    Station stationS = new Station();
    stationS.setNetwork("MBTA");
    stationS.setLineName("Green");
    stationS.setName("Arlington");
    stationS.setAddress("Arlington St and Boylston St");
    stationS.setCity("Boston");
    stationS.setState("MA");
    stationS.setZip("02116");
    stationS.setCountry("USA");
    stationS.setImageUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRJyDp_sg7hGpMFQlqznirNbpNvS6vp8P_DjKzLWuymwK9ZWWt5&usqp=CAU");
    stationS.setDescription("Covered underground stop in Back Bay area next to Boylston St");
    stationS.setCalculatedCost("Fare");
    stationS.setAdminApproved(true);
    stations.add(stationS);

    Station stationT = new Station();
    stationT.setNetwork("MBTA");
    stationT.setLineName("Green");
    stationT.setName("Lechmere");
    stationT.setAddress("Cambridge St and O'Brien Hwy");
    stationT.setCity("Cambridge");
    stationT.setState("MA");
    stationT.setZip("02141");
    stationT.setCountry("USA");
    stationT.setImageUrl("https://live.staticflickr.com/1949/43379414640_b7e2c56897_b.jpg");
    stationT.setDescription("Outdoor next to Cambridge, Last stop on Green Line T");
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
