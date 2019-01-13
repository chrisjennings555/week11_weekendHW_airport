import java.util.ArrayList;

public class Runway {

    private ArrayList<Plane> runway;
    private int capacity;

    public Runway(){
        this.runway = new ArrayList<>();
        this.capacity = 1;
    }


    public int getPlaneCount() {
        return this.runway.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPlaneToRunway(Plane plane) {
        if(getPlaneCount() < capacity){
            this.runway.add(plane);
        }
    }
}
