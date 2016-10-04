package pr01_Students;

public class Students {

    private String name;
    private static Integer studentsCount = 0;

    public Students(String name) {
        this.name = name;
        studentsCount++;
    }

    public static Integer getStudentsCount() {
        return studentsCount;
    }
}
