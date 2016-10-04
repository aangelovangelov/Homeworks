package pr05_SpeedRacing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCost;
    private double distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }

    public void calculateTotalDistance(double distance) {
        if (this.isFuelEnough(distance)) {
            this.distanceTraveled += distance;
            this.burnFuel(distance);
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %.0f", this.model, this.fuelAmount, this.distanceTraveled);
    }

    private boolean isFuelEnough(double distance) {
        return distance * this.fuelCost <= fuelAmount;
    }

    private void burnFuel(double distance) {
        this.fuelAmount -= distance * this.fuelCost;
    }
}
