import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private AirlineType airlineType;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, AirlineType airlineType){
        this.planeType = planeType;
        this.airlineType = airlineType;
        this.passengers = new ArrayList<>();
    }


    public PlaneType getPlaneType() {
        return planeType;
    }

    public AirlineType getAirlineType() {
        return airlineType;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int findPassengerIndex(Passenger passenger){
        return this.passengers.indexOf(passenger.name);
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
