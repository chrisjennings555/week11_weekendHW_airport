public enum PlaneType {
    BOEING("747", 3),
    AIRBUS("A380", 2);

    public final String model;
    public final int capacity;

    PlaneType(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }
}
