package pr03_AnimalFarm;

public class Chicken {

    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 15;

    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) {
            throw new IllegalArgumentException(String.format("Age should be between %s and %s.", MIN_AGE, MAX_AGE));
        }
        this.age = age;
    }

    private int calculateProductPerDay() {
        switch (this.age) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
            case 7:
                return 3;
            default:
                return 1;
        }
    }
}
