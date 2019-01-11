import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Bill", 50);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Bill", passenger.getName());
    }

    @Test
    public void passengerHasWallet(){
        assertEquals(50, passenger.getWallet());
    }
}
