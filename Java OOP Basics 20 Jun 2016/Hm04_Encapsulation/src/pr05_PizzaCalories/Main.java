package pr05_PizzaCalories;

import pr05_PizzaCalories.entitiesForPizza.Dough;
import pr05_PizzaCalories.entitiesForPizza.Topping;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] pizzaLine = reader.readLine().split("\\s+");
        String[] doughLine = reader.readLine().split("\\s+");

        try {

            if (Double.parseDouble(pizzaLine[2]) < 1 || Double.parseDouble(pizzaLine[2]) > 10) {
                throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
            }

            Dough dough = new Dough(doughLine[1], doughLine[2], Double.parseDouble(doughLine[3]));
            Pizza pizza = new Pizza(pizzaLine[1], dough);

            while (true) {
                String[] toppingLine = reader.readLine().split("\\s+");
                if (toppingLine[0].equals("END")) {
                    break;
                }

                Topping topping = new Topping(toppingLine[1], Double.parseDouble(toppingLine[2]));
                pizza.addTopping(topping);
            }

            System.out.printf("%s - %.2f Calories.", pizza.getName(), pizza.getTotalCalories());

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
