package pr05_AnimalClinic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        AnimalClinic clinic = new AnimalClinic();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if ("End".equals(input[0])) {
                break;
            }

            String animalName = input[0];
            String animalBreed = input[1];
            String command = input[2];

            Animal animal = new Animal(animalName, animalBreed, command);

            clinic.addPatient(animal);
        }

        for (Animal animal : clinic.getPatients()) {
            System.out.println(animal);
        }

        System.out.printf("Total healed animals: %d%n", AnimalClinic.getHealedAnimalsCount());
        System.out.printf("Total rehabilitated animals: %d%n", AnimalClinic.getRehabilitatedAnimalsCount());

        String command = reader.readLine();

        clinic.getPatients().stream()
                .filter(a1 -> a1.getCommand().equals(command))
                .forEach(animal -> System.out.printf("%s %s%n",animal.getName(), animal.getBreed()));
    }
}
