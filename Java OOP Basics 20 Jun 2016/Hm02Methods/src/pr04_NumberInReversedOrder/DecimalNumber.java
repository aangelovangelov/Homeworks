package pr04_NumberInReversedOrder;

public class DecimalNumber {

    private StringBuilder number;

    public DecimalNumber(String number) {
        this.number = new StringBuilder(number);
    }

    public void printReversed() {
        System.out.println(this.number.reverse().toString());
    }
}
