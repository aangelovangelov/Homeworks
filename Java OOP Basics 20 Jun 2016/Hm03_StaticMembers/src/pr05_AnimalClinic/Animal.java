package pr05_AnimalClinic;

public class Animal {
    private String name;
    private String breed;
    private String command;
    private Integer animalId;

    public Animal(String name, String breed, String command) {
        this.name = name;
        this.breed = breed;
        this.command = command;
        this.setAnimalId(0);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getCommand() {
        return command;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String toString() {
        if (this.command.equals("heal")) {
            return String.format("Patient %d: [%s (%s)] has been healed!", this.animalId, this.name, this.breed);
        } else {
            return String.format("Patient %d: [%s (%s)] has been rehabilitated!", this.animalId, this.name, this.breed);
        }
    }
}
