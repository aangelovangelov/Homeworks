package pr03_TemperatureConverter;

public class Temperature {
    private String type;
    private static Integer value;

    public Temperature(String type, Integer value) {
        this.type = type;
        this.value = value;
    }

    public static Double toFahrenheit() {
        return Temperature.value * (9 / 5d) + 32;
    }

    public static Double toCelsius() {
        return (Temperature.value - 32d) / (1.8);
    }
}
