package idsprint1;

public class Bicycle extends RentedVehicle {
    private int nbDays;

    public Bicycle(double baseFee, int nbDays) {
        super(baseFee);
        this.nbDays = nbDays;
    }

    public int getNbDays() {
        return nbDays;
    }

    @Override
    public double getCost() {
        return super.getCost() * nbDays;
    }
}
