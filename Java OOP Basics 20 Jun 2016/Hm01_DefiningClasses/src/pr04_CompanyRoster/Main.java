package pr04_CompanyRoster;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int lineCount = Integer.parseInt(reader.readLine());

            //  department   salarys
            Map<String, List<Double>> salaryes = new HashMap<>();

            //  department   employer
            Map<String, List<Employee>> employers = new HashMap<>();

            for (int i = 0; i < lineCount; i++) {
                String[] input = reader.readLine().split("\\s+");
                String name = input[0];
                double salary = Double.parseDouble(input[1]);
                String position = input[2];
                String department = input[3];

                if (!salaryes.containsKey(department)) {
                    salaryes.put(department, new ArrayList<>());
                }
                if (!employers.containsKey(department)) {
                    employers.put(department, new ArrayList<>());
                }
                salaryes.get(department).add(salary);

                if (input.length == 4) {

                    Employee employee = new Employee(name, salary, position, department);
                    employers.get(department).add(employee);

                } else if (input.length == 5) {

                    if (isInteger(input[4])) {
                        int age = Integer.parseInt(input[4]);
                        Employee employee = new Employee(name, salary, position, department, age);
                        employers.get(department).add(employee);

                    } else {
                        String email = input[4];
                        Employee employee = new Employee(name, salary, position, department, email);
                        employers.get(department).add(employee);
                    }
                } else {//input.length == 6

                    String email = input[4];
                    int age = Integer.parseInt(input[5]);
                    Employee employee = new Employee(name, salary, position, department, email, age);
                    employers.get(department).add(employee);
                }
            }


            String bestDepartment = "";
            double bestAvarageSalary = Double.MIN_VALUE;
            for (String department : salaryes.keySet()) {

                double sum = 0;
                for (Double salary : salaryes.get(department)) {
                    sum += salary;
                }

                double currAvarage = sum / salaryes.get(department).size();
                if (currAvarage > bestAvarageSalary) {
                    bestAvarageSalary = currAvarage;
                    bestDepartment = department;
                }
            }

            System.out.printf("Highest Average Salary: %s%n", bestDepartment);
            employers.get(bestDepartment).stream()
                    .sorted((emp1, emp2) -> Double.compare(emp2.salary, emp1.salary))
                    .forEach(emp -> System.out.printf("%s %.2f %s %d%n", emp.name, emp.salary, emp.email, emp.age));

        }
    }

    public static boolean isInteger(String s) {
        if (s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-') {

                if (s.length() == 1) {
                    return false;
                }
                continue;

            }
            if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
