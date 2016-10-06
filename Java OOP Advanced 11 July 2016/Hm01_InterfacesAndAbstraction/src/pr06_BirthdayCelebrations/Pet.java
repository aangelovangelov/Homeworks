package pr06_BirthdayCelebrations;

import pr06_BirthdayCelebrations.interfaces.Birthavable;
import pr06_BirthdayCelebrations.interfaces.Society;

public class Pet implements Society, Birthavable {

    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        this.setName(name);
        this.setBirthDate(birthDate);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}


