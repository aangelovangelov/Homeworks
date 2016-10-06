package pr03_CardsWithPower.enums;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private CardSuit(int power) {
        this.setPower(power);
    }

    public int getPower() {
        return power;
    }

    private void setPower(int power) {
        this.power = power;
    }
}
