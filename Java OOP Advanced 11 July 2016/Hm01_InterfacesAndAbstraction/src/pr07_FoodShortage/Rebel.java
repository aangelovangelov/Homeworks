package pr07_FoodShortage;

import pr07_FoodShortage.interfaces.Groupable;

public class Rebel extends PersonImpl implements Groupable {

    private static final int INCREMENTING = 5;

    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.setGroup(group);
    }

    private void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
        super.setFood(INCREMENTING);
    }
}
