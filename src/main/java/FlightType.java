public enum FlightType {

    ECONOMY(100, AirportType.GLASGOW, 25),
    BUSINESS(200, AirportType.EDINBURGH, 50),
    FIRSTCLASS(300, AirportType.BELFAST, 100);

    public final int flightNumber;
    public final AirportType destination;
    public final int price;

    FlightType(int flightNumber, AirportType destination, int price){
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.price = price;
    }


}
