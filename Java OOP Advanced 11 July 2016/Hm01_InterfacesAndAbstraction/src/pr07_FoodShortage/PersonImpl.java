package pr07_FoodShortage;

import pr07_FoodShortage.interfaces.Buyer;
import pr07_FoodShortage.interfaces.Person;

public abstract class PersonImpl implements Person, Buyer {

    private String name;
    private int age;
    private int food;

    public PersonImpl(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.food = 0;
    }

    protected void setFood(int food) {
        this.food += food;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
