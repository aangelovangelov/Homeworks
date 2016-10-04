package pr08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //trainerName, Trainer
        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (true) {
            String[] input = reader.readLine().split("\\s+");
            if (input[0].equals("Tournament")) {
                break;
            }

            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = Integer.parseInt(input[3]);

            if (!trainers.containsKey(trainerName)) {
                trainers.put(trainerName, new Trainer(trainerName));
            }

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainers.get(trainerName).addPokemon(pokemon);

        }

        while (true) {
            String element = reader.readLine();
            if ("End".equals(element)) {
                break;
            }

            for (Trainer trainer : trainers.values()) {

                boolean haveThisPokemon = trainer.containsPokemon(element);

                if (haveThisPokemon) {
                    trainer.setBadges(trainer.getBadges() + 1);
                } else {

                    for (Pokemon pokemon : trainer.getPokemons()) {
                        pokemon.takeDamage();
                        if (pokemon.getHealth() <= 0) {
                            trainer.removePokemon(pokemon);
                        }
                    }
                }
            }

        }

        trainers.values().stream()
                .sorted((tr1, tr2) -> Integer.compare(tr2.getBadges(), tr1.getBadges()))
                .forEach(System.out::println);
    }
}
