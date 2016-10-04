package pr07_BasicMath;

public class MathUtil {

    public static Double sum(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static Double subtract(Double firstNumber, Double secondNumber) {
        return firstNumber - secondNumber;
    }

    public static Double multiply(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    public static Double divide(Double dividend, Double divisor) {
        return dividend / divisor;
    }

    public static Double percentage(Double number, Double percent) {
        return number * (percent / 100);
    }
}
