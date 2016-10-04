package pr04_ShoppingSpree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            List<Person> people = new ArrayList<>();
            String[] personInput = reader.readLine().split(";");
            personParser(people, personInput);

            List<Product> products = new ArrayList<>();
            String[] productInput = reader.readLine().split(";");
            productParser(products, productInput);

            while (true) {
                String[] input = reader.readLine().split("\\s+");
                if ("END".equals(input[0])) {
                    break;
                }

                String personName = input[0];
                String productName = input[1];

                for (int i = 0; i < people.size(); i++) {
                    for (int j = 0; j < products.size(); j++) {
                        Person person = people.get(i);
                        Product product = products.get(j);

                        if (person.getName().equals(personName) && product.getName().equals(productName)) {
                            person.tryAddProduct(product);
                        }
                    }
                }
            }

            for (int i = 0; i < people.size(); i++) {

                Person person = people.get(i);

                System.out.printf("%s - ", person.getName());

                StringBuilder output = new StringBuilder();
                for (int j = 0; j < person.getProducts().size(); j++) {
                    Product product = person.getProducts().get(j);
                    output.append(product.toString());
                    output.append(", ");
                }

                if (output.length() != 0) {
                    output.delete(output.length() - 2, output.length() - 1);
                    System.out.println(output.toString());
                } else {
                    System.out.println("Nothing bought");
                }
            }
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void personParser(List<Person> people, String[] personInput) {
        for (int i = 0; i < personInput.length; i++) {
            String[] input = personInput[i].split("=");
            String name = input[0];
            Double money = Double.parseDouble(input[1]);

            people.add(new Person(name, money));
        }
    }

    private static void productParser(List<Product> products, String[] productInput) {
        for (int i = 0; i < productInput.length; i++) {
            String[] input = productInput[i].split("=");
            String name = input[0];
            Double cost = Double.parseDouble(input[1]);

            products.add(new Product(name, cost));
        }
    }
}
