package idsprint1;

public class Car extends FuelVehicle {
    private int nbSeats;

    public Car(double baseFee, double nbKms, int nbSeats) {
        super(baseFee, nbKms);
        this.nbSeats = nbSeats;
    }

    public int getNbSeats() {
        return nbSeats;
    }

    @Override
    public double getCost() {
        return super.getCost() + (nbSeats * getBaseFee()) + getMileageFees();
    }
}

