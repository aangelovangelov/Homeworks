package pr07_CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine, int weight) {
        this(model, engine, weight, "n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model, engine, -1, color);
    }

    public Car(String model, Engine engine) {
        this(model, engine, -1, "n/a");
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        String displacement = String.valueOf(this.engine.getDisplacement());
        if (displacement.equals("-1")) {
            displacement = "n/a";
        }

        String weight = String.valueOf(this.weight);
        if (weight.equals("-1")) {
            weight = "n/a";
        }

        output
                .append(this.model + ":")
                .append(System.lineSeparator())
                .append("  " + this.engine.getModel() + ":")
                .append(System.lineSeparator())
                .append("    Power: " + this.engine.getPower())
                .append(System.lineSeparator())
                .append("    Displacement: " + displacement)
                .append(System.lineSeparator())
                .append("    Efficiency: " + this.engine.getEfficiency())
                .append(System.lineSeparator())
                .append("  Weight: " + weight)
                .append(System.lineSeparator())
                .append("  Color: " + this.color);

        return output.toString();
    }
}
