package pr08_CardGame.enums;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int power;

    private Suit(int power) {
        this.setPower(power);
    }

    public int getPower() {
        return power;
    }

    private void setPower(int power) {
        this.power = power;
    }
}
