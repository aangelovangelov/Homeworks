package pr03_LastDigitName;

public class Number {

    int number;

    public Number(int number) {
        this.number = number;
    }

    public String getLastDigitName() {
        int lastDigit = this.number % 10;
        String[] digitNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        return digitNames[lastDigit];
    }
}
