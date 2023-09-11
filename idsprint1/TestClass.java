package idsprint1;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        RentedVehicle[] vehicles = generateRandomVehicles(6);
        printVehicleDetails(vehicles);
    }

    public static RentedVehicle[] generateRandomVehicles(int numVehicles) {
        Random random = new Random();
        RentedVehicle[] vehicles = new RentedVehicle[numVehicles];

        for (int i = 0; i < numVehicles; i++) {
            int randomNum = random.nextInt(3) + 1;
            double baseFee = random.nextDouble() * 100;
            double nbKms = random.nextDouble() * 500;
            int nbSeats = random.nextInt(4) + 1;
            int capacity = random.nextInt(6) + 1;
            int nbDays = random.nextInt(10) + 1;

            switch (randomNum) {
                case 1:
                    vehicles[i] = new Car(baseFee, nbKms, nbSeats);
                    break;
                case 2:
                    vehicles[i] = new Truck(baseFee, nbKms, capacity);
                    break;
                case 3:
                    vehicles[i] = new Bicycle(baseFee, nbDays);
                    break;
            }
        }

        return vehicles;
    }

    public static void printVehicleDetails(RentedVehicle[] vehicles) {
        for (RentedVehicle vehicle : vehicles) {
            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("Car: Number of seats - " + car.getNbSeats() + ", Cost - $" + car.getCost());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                System.out.println("Truck: Capacity - " + truck.getCapacity() + ", Cost - $" + truck.getCost());
            } else if (vehicle instanceof Bicycle) {
                Bicycle bicycle = (Bicycle) vehicle;
                System.out.println("Bicycle: Number of days rented - " + bicycle.getNbDays() + ", Cost - $" + bicycle.getCost());
            }
        }
    }
}

