package pr05_AnimalClinic;

import java.util.ArrayList;
import java.util.List;

public class AnimalClinic {
    private static Integer totalPatients = 0;
    private static Integer healedAnimalsCount = 0;
    private static Integer rehabilitatedAnimalsCount = 0;
    private List<Animal> patients;

    public AnimalClinic() {
        this.patients = new ArrayList<>();
    }

    public static Integer getHealedAnimalsCount() {
        return healedAnimalsCount;
    }

    public static Integer getRehabilitatedAnimalsCount() {
        return rehabilitatedAnimalsCount;
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public void addPatient(Animal patient) {
        this.patients.add(patient);
        this.incrementer(patient.getCommand());
        this.putID(patient);
    }

    private void putID(Animal patient) {
        patient.setAnimalId(AnimalClinic.totalPatients);
    }

    private void incrementer(String command) {
        AnimalClinic.totalPatients++;
        if ("heal".equals(command)) {
            AnimalClinic.healedAnimalsCount++;
        } else {
            AnimalClinic.rehabilitatedAnimalsCount++;
        }
    }
}
