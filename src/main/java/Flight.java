public class Flight {

    private FlightType flight;
    private Plane plane;

    public Flight(FlightType flight, Plane plane){
        this.flight = flight;
        this.plane = plane;
    }


    public FlightType getFlightType() {
        return flight;
    }

    public int getPriceOfFlight() {
        return flight.price;
    }

    public int getFlightNumber() {
        return flight.flightNumber;
    }


    public AirportType getDestination() {
        return flight.destination;
    }

    public Plane getPlane(){
        return plane;
    }


}
