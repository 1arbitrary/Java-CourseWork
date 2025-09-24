import java.util.*;

class Vehicle {
    protected String regNo;
    protected String brand;
    protected double baseRate;

    public Vehicle(String regNo, String brand, double baseRate) {
        this.regNo = regNo;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    public double calculateRent() {
        return baseRate;
    }
}

class Car extends Vehicle {
    public Car(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.5;
    }
}

class Bike extends Vehicle {
    public Bike(String regNo, String brand, double baseRate) {
        super(regNo, brand, baseRate);
    }

    @Override
    public double calculateRent() {
        return baseRate * 1.2;
    }
}

public class L_VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] carInput = sc.nextLine().split(",");
        Vehicle car = new Car(carInput[1], carInput[2], Double.parseDouble(carInput[3]));
        System.out.println(carInput[0] + " " + car.regNo + " " + car.brand + " Rent: " + car.calculateRent());

        String[] bikeInput = sc.nextLine().split(",");
        Vehicle bike = new Bike(bikeInput[1], bikeInput[2], Double.parseDouble(bikeInput[3]));
        System.out.println(bikeInput[0] + " " + bike.regNo + " " + bike.brand + " Rent: " + bike.calculateRent());
    }
}
