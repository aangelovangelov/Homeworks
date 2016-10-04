package pr05_PizzaCalories.entitiesForPizza;

public class Topping {
    private static final int DEF_CAL_PER_GR = 2;
    
    private Double toppingType;
    private Double weight;
    private Double calPerGram;
    private Double calories;

    public Topping(String toppingType, Double weight) {
        this.setToppingType(toppingType);
        this.setWeight(toppingType, weight);
        this.setCalPerGram();
        this.setCalories();
    }

    public Double getCalories() {
        return calories;
    }

    private void setToppingType(String toppingType) {
        switch (toppingType.toLowerCase()) {
            case "meat":
                this.toppingType = 1.2;
                break;
            case "veggies":
                this.toppingType = 0.8;
                break;
            case "cheese":
                this.toppingType = 1.1;
                break;
            case "sauce":
                this.toppingType = 0.9;
                break;
            default:
                throw new IllegalArgumentException(String.format(
                        "Cannot place %s on top of your pizza.", toppingType));

        }
    }

    private void setWeight(String toppingType, Double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format(
                    "%s weight should be in the range [1..50].", toppingType));
        }
        this.weight = weight;
    }

    public void setCalPerGram() {
        this.calPerGram = DEF_CAL_PER_GR * toppingType;
    }

    public void setCalories() {
        this.calories = this.calPerGram * this.weight;
    }
}
