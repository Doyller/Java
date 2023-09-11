package idsprint1;

public class Truck extends FuelVehicle {
    private int capacity;

    public Truck(double baseFee, double nbKms, int capacity) {
        super(baseFee, nbKms);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public double getCost() {
        return super.getCost() + (capacity * getBaseFee()) + getMileageFees();
    }
}
