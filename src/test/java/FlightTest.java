import com.sun.prism.shader.FillRoundRect_LinearGradient_REPEAT_Loader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane1;

    @Before
    public void before(){
        flight = new Flight(FlightType.ECONOMY, plane1);
    }

    @Test
    public void flightHasFlightType(){
        assertEquals(FlightType.ECONOMY, flight.getFlightType());
    }

    @Test
    public void flightHasPrice(){
        assertEquals(FlightType.ECONOMY.price, flight.getPriceOfFlight());
    }

    @Test
    public void flightHasFlightNumber(){
        assertEquals(FlightType.ECONOMY.flightNumber, flight.getFlightNumber());
    }

    @Test
    public void flightHasDestination(){
        assertEquals(FlightType.ECONOMY.destination, flight.getDestination());
    }

    @Test
    public void flightHasAPlane(){
        assertEquals(plane1, flight.getPlane());
    }

}
