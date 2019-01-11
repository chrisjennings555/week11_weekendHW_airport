import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING, AirlineType.BA);
        passenger1 = new Passenger("Bill", 50);
        passenger2 = new Passenger("Conor", 60);
        passenger3 = new Passenger("Mike", 70);
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

    @Test
    public void passengerCanBeRemovedFromPlane(){
        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPassenger(passenger3);
        assertEquals(3, plane1.getPassengerCount());
        plane1.removePassenger(passenger2);
        assertEquals(2, plane1.getPassengerCount());
    }
}
