package pr05_PizzaCalories.entitiesForPizza;

public class Dough {
    private static final int DEF_CAL_PER_GR = 2;

    private Double flourType;
    private Double bakingTechnique;
    private Double weight;
    private Double calPerGram;
    private Double calories;

    public Dough(String flourType, String bakingTechnique, Double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
        this.setCalPerGram();
        this.setCalories();
    }

    public Double getCalories() {
        return calories;
    }

    private void setFlourType(String flourType) {
        switch (flourType.toLowerCase()) {
            case "white":
                this.flourType = 1.5d;
                break;
            case "wholegrain":
                this.flourType = 1d;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique.toLowerCase()) {
            case "crispy":
                this.bakingTechnique = 0.9;
                break;
            case "chewy":
                this.bakingTechnique = 1.1;
                break;
            case "homemade":
                this.bakingTechnique = 1d;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(Double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    private void setCalPerGram() {
        this.calPerGram = DEF_CAL_PER_GR * this.flourType * this.bakingTechnique;
    }

    private void setCalories() {
        this.calories = this.calPerGram * this.weight;
    }
}
