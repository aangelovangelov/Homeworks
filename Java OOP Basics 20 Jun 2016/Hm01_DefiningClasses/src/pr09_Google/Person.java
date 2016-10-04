package pr09_Google;

import pr09_Google.personEntities.*;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;

    public Person(String name) {
        this.name = name;
        this.company = null;
        this.car = null;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void addChild(Child child) {
        this.children.add(child);
    }

    public void addField(String[] input) {
        String fieldType = input[1];

        switch (fieldType) {
            case "company":
                this.setCompany(new Company(input[2], input[3], Double.parseDouble(input[4])));
                break;

            case "pokemon":
                this.addPokemon(new Pokemon(input[2], input[3]));
                break;

            case "parents":
                this.addParent(new Parent(input[2], input[3]));
                break;

            case "children":
                this.addChild(new Child(input[2], input[3]));
                break;

            case "car":
                this.setCar(new Car(input[2], Double.parseDouble(input[3])));
                break;
        }
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        String company = System.lineSeparator();
        if (this.company != null) {
            company = this.company.toString();
        }

        String car = System.lineSeparator();
        if (this.car != null) {
            car = this.car.toString();
        }

        output.append(this.name).append(System.lineSeparator())
                .append(String.format("Company:%s", company))
                .append(String.format("Car:%s", car));

        output.append("Pokemon:");
        for (Pokemon pokemon : this.pokemons) {
            output.append(pokemon);

        }

        output.append(System.lineSeparator()).append("Parents:");
        for (Parent parent : this.parents) {
            output.append(parent);
        }

        output.append(System.lineSeparator()).append("Children:");
        for (Child child : this.children) {
            output.append(child);
        }

        return output.toString();
    }
}
