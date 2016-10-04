package pr04_ShoppingSpree;

public class Product {
    private String name;
    private Double cost;

    public Product(String name, Double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    public String getName() {
        return name;
    }

    public Double getCost() {
        return cost;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setCost(Double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.cost = cost;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
