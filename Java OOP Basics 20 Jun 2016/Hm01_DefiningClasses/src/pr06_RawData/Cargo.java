package pr06_RawData;

public class Cargo extends Engine{
    private double cargoWeight;
    private String cargoType;

    public Cargo(double engineSpeed, double enginePower, double cargoWeight, String cargoType) {
        super(engineSpeed, enginePower);
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }
}
