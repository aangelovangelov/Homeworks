package pr09_Google.personEntities;

public class Pokemon {
    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }


    @Override
    public String toString() {
        return String.format("%n%s %s", this.pokemonName, this.pokemonType);
    }
}
