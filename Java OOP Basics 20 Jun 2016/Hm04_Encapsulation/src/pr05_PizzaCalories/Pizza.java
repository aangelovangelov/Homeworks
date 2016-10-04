package pr05_PizzaCalories;

import pr05_PizzaCalories.entitiesForPizza.Dough;
import pr05_PizzaCalories.entitiesForPizza.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, Dough dough) {
        this.setName(name);
        this.dough = dough;
        this.toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTotalCalories() {
        Double totalCal = this.dough.getCalories();
        for (int i = 0; i < this.toppings.size(); i++) {
            totalCal += this.toppings.get(i).getCalories();
        }
        return totalCal;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.length() < 1 || name.length() > 15) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
}
