package pr08_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    String name;
    int badges;
    List<Pokemon> pokemons;

    Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.badges = 0;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon) {
        this.pokemons = this.pokemons
                .stream()
                .filter(p -> p.getHealth() > 0)
                .collect(Collectors.toList());
    }

    public boolean containsPokemon(String element) {
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon.getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", this.name, this.badges, this.pokemons.size());
    }
}