import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Passenger passenger1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING, AirlineType.BA);
        passenger1 = new Passenger("Bill", 50);
    }

    @Test
    public void planeHasPlaneType(){
        assertEquals(PlaneType.BOEING, plane1.getPlaneType());
    }

    @Test
    public void planeHasAirlineType(){
        assertEquals(AirlineType.BA, plane1.getAirlineType());
    }

    @Test
    public void planeStartsWithNoPassengers(){
        assertEquals(0, plane1.getPassengerCount());
    }

    @Test
    public void passengerCanBeAddedToPlane(){
        plane1.addPassenger(passenger1);
        assertEquals(1, plane1.getPassengerCount());
    }

    @Test
    public void passengerCanBeLocated(){
        plane1.addPassenger(passenger1);
        assertEquals(1, plane1.getPassengerCount());
        assertEquals(0, plane1.findPassengerIndex(passenger1));
    }

//
//    @Test
//    public void passengerCanBeRemovedFromPlane(){
//        plane1.addPassenger(passenger1);
//        assertEquals(1, plane1.getPassengerCount());
//        plane1.removePassenger();
//        assertEquals(0, plane1.getPassengerCount());
//    }
}
