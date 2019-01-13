import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunwayTest {

    Runway runway;
    Plane plane1;
    Plane plane2;

    @Before
    public void before(){
        runway = new Runway();
        plane1 = new Plane(PlaneType.BOEING, AirlineType.BA);
        plane2 = new Plane(PlaneType.AIRBUS, AirlineType.EASYJET);
    }

    @Test
    public void runwayIsClear(){
        assertEquals(0, runway.getPlaneCount());
    }

    @Test
    public void runwayCapacityIsOne(){
        assertEquals(1, runway.getCapacity());
    }

    @Test
    public void onlyOnePlaneCanBeOnTheRunway(){
        runway.addPlaneToRunway(plane1);
        runway.addPlaneToRunway(plane2);
        assertEquals(1, runway.getPlaneCount());
    }


}
