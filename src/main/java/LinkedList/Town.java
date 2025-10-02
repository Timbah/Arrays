package LinkedList;

public class Town {
//Could have made it a record LOL

    private String name;
    private double distanceFromStart;

    public Town(String name, double distanceFromStart) {
        this.name = name;
        this.distanceFromStart = distanceFromStart;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromStart() {
        return distanceFromStart;
    }
}
