package pr06_BirthdayCelebrations;

import pr06_BirthdayCelebrations.interfaces.Society;

public class Robot implements Society {

    private String model;
    private String id;

    public Robot(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
