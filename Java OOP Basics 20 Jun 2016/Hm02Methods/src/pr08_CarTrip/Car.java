package pr08_CarTrip;

public class Car {

    private Double speed;
    private Double fuel;
    private Double fuelEconomy;
    private Double distanceTraveled;

    public Car(Double speed, Double fuel, Double fuelEconomy) {
        this.speed = speed;
        this.fuel = fuel;
        this.fuelEconomy = fuelEconomy;
        this.distanceTraveled = 0d;
    }

    public void executor(String[] commands) {
        switch (commands[0]) {

            case "Travel":
                this.travel(Double.parseDouble(commands[1]));
                break;

            case "Distance":
                this.getDistanceTraveled();
                break;

            case "Time":
                this.getTime();
                break;

            case "Fuel":
                this.getFuel();
                break;

            case "Refuel":
                this.refuel(Double.parseDouble(commands[1]));
                break;
        }
    }

    private void getFuel() {
        System.out.printf("Fuel left: %.1f liters%n", this.fuel);
    }

    private void refuel(Double liters) {
        this.fuel += liters;
    }

    private void getDistanceTraveled() {
        System.out.printf("Total distance: %.1f kilometers%n", this.distanceTraveled);
    }

    private void getTime() {
        Double totalMins = this.distanceTraveled / this.speed * 60;
        System.out.printf("Total time: %d hours and %d minutes%n", totalMins.intValue() / 60, totalMins.intValue() %
                60);
    }

    private void travel(Double distance) {
        Double fuelForMove = this.neededFuel(distance);
        if (fuelForMove <= this.fuel) {
            this.distanceTraveled += distance;
            this.fuel -= fuelForMove;
        } else {
            this.distanceTraveled += this.fuel / this.fuelEconomy * 100;
            this.fuel = 0d;
        }
    }

    private Double neededFuel(Double distance) {
        return distance / 100 * this.fuelEconomy;
    }
}
