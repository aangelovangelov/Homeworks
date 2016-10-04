package pr09_Google.personEntities;

public class Parent {
    private String parentName;
    private String parentBirthday;

    public Parent(String parentName, String parentBirthday) {
        this.parentName = parentName;
        this.parentBirthday = parentBirthday;
    }

    @Override
    public String toString() {
        return String.format("%n%s %s", this.parentName, this.parentBirthday);
    }
}
