package pr09_Google.personEntities;

public class Car {
    private String carModel;
    private Double carSpeed;

    public Car(String carModel, Double carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%n%s %.0f%n", this.carModel, this.carSpeed);
    }
}
