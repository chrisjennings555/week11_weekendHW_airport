import java.util.ArrayList;

public class Airport {

    private AirportType airport;
    private ArrayList<Plane> hangar;
    private Runway runway;

    public Airport(AirportType airport){
        this.airport = airport;
        this.hangar = new ArrayList<>();
        this.runway = new Runway();
    }


    public AirportType getAirportType() {
        return this.airport;
    }


    public int getPlaneCountHangar() {
        return this.hangar.size();
    }

    public void addPlaneToHangar(Plane plane) {
        this.hangar.add(plane);
    }

    public int findPlaneByIndex(Plane plane){
        return this.hangar.indexOf(plane);
    }

    public void removePlaneFromHangar(Plane plane) {
        int planeIndex = findPlaneByIndex(plane);
        this.hangar.remove(planeIndex);
    }

    public void addPlaneToRunway(Plane plane){
        this.runway.addPlaneToRunway(plane);
    }

    public int getPlaneCountRunway() {
        return this.runway.getPlaneCount();
    }

}

