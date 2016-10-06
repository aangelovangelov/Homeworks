package pr03_Ferrari;

public class Ferrari extends Driver implements Car {

    private static final String MODEL = "488-Spider";

    public Ferrari(String name) {
        super(name);
    }

    @Override
    public String useBreaks() {
        return "Brakes!";
    }

    @Override
    public String gasPedal() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MODEL)
                .append("/")
                .append(this.useBreaks())
                .append("/")
                .append(this.gasPedal())
                .append("/")
                .append(this.getName());

        return sb.toString();
    }
}
