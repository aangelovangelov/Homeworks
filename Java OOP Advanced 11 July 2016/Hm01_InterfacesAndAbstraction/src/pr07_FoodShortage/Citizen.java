package pr07_FoodShortage;

import pr07_FoodShortage.interfaces.Birthable;
import pr07_FoodShortage.interfaces.Society;

public class Citizen extends PersonImpl implements Society, Birthable {

    private static final int INCREMENTING = 10;

    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age);
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    private void setId(String id) {
        this.id = id;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void buyFood() {
        super.setFood(INCREMENTING);
    }
}
