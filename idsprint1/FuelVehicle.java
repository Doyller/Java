package idsprint1;

public class FuelVehicle extends RentedVehicle {
    private double nbKms;

    public FuelVehicle(double baseFee, double nbKms) {
        super(baseFee);
        this.nbKms = nbKms;
    }

    public double getNbKms() {
        return nbKms;
    }

    public double getMileageFees() {
        double mileageFees;
        if (nbKms < 100) {
            mileageFees = 0.2 * nbKms;
        } else if (nbKms <= 400) {
            mileageFees = 0.3 * nbKms;
        } else {
            mileageFees = 0.3 * 400 + 0.5 * (nbKms - 400);
        }
        return mileageFees;
    }
}
