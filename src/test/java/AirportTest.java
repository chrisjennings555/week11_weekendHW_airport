import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        airport = new Airport(AirportType.EDINBURGH);
        plane1 = new Plane(PlaneType.BOEING, AirlineType.BA);
        plane2 = new Plane(PlaneType.BOEING, AirlineType.EMIRATES);
        plane3 = new Plane(PlaneType.AIRBUS, AirlineType.EASYJET);
    }

    @Test
    public void airportHasAirportType(){
        assertEquals(AirportType.EDINBURGH, airport.getAirportType());
    }

    @Test
    public void airportHangarIsEmpty(){
        assertEquals(0, airport.getPlaneCountHangar());
    }

    @Test
    public void planeCanBeAddedToHangar(){
        airport.addPlaneToHangar(plane1);
        assertEquals(1, airport.getPlaneCountHangar());
    }

    @Test
    public void planeCanBeRemovedFromHangar(){
        airport.addPlaneToHangar(plane1);
        airport.addPlaneToHangar(plane2);
        airport.addPlaneToHangar(plane3);
        assertEquals(3, airport.getPlaneCountHangar());
        airport.removePlaneFromHangar(plane2);
        assertEquals(2, airport.getPlaneCountHangar());
    }

    @Test
    public void noPlanesOnTheRunway(){
        assertEquals(0, airport.getPlaneCountRunway());
    }

    @Test
    public void planeOnTheRunway(){
        airport.addPlaneToRunway(plane1);
        assertEquals(1, airport.getPlaneCountRunway());
    }

    @Test
    public void planeCanBeSentFromHangarToRunway(){
        airport.addPlaneToHangar(plane1);
        assertEquals(1, airport.getPlaneCountHangar());
        airport.sendPlaneFromHangarToRunway(plane1);
        assertEquals(1, airport.getPlaneCountRunway());
        assertEquals(0, airport.getPlaneCountHangar());
    }


}
