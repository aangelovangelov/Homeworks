package pr04_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Double money;
    private List<Product> products;

    public Person(String name, Double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void tryAddProduct(Product product) {
        if (this.canAfford(product)) {
            this.decreaseMoney(product);
            this.products.add(product);
            System.out.printf("%s bought %s%n", this.name, product.getName());
        } else {
            System.out.printf("%s can't afford %s%n", this.name, product.getName());
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    private void decreaseMoney(Product product) {
        this.money -= product.getCost();
    }

    private boolean canAfford(Product product) {
        if (this.money >= product.getCost()) {
            return true;
        }

        return false;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    private void setMoney(Double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }

        this.money = money;
    }
}
