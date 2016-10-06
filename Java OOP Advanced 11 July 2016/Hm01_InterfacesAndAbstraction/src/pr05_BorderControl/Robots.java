package pr05_BorderControl;

public class Robots implements Society{

    private String model;

    private String id;

    public Robots(String model, String id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
