public enum PlaneType {
    BOEING("747", 3),
    AIRBUS("A380", 2);

    private final String model;
    private final int capacity;

    PlaneType(String model, int capacity){
        this.model = model;
        this.capacity = capacity;
    }
}
