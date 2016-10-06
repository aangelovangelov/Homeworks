package pr06_CustomEnumAnnotations.enums;

import pr06_CustomEnumAnnotations.anotations.CustomAnnotation;

@CustomAnnotation(category = "Suit", description = "Provides suit constants for a Card class")
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
