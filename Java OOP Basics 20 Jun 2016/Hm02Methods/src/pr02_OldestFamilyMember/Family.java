package pr02_OldestFamilyMember;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<Person> people;

    public Family() {
        this.people = new ArrayList<>();
    }

    public void addFamilyMember(Person member) {
        people.add(member);
    }

    public Person getOldestMember() {
        return people.stream().max((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).get();
    }
}
