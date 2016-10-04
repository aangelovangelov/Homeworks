package pr04_CompanyRoster;

public class Employee {
    String name;
    double salary;
    String position;
    String department;
    String email;
    int age;

    Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    Employee(String name, double salary, String position, String department) {
        this(name, salary, position, department, "n/a", -1);
    }

    Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, email, -1);
    }

    Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, "n/a", age);
    }

    public double getSalary() {
        return salary;
    }

//    int compare(double num1, double num2) {
//        if (num1 > num2) {
//            return 1;
//        }
//        if (num1 < num2) {
//            return -1;
//        }
//        return 0;
//    }
}
