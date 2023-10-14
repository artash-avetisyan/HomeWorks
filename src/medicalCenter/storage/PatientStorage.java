package medicalCenter.storage;

import medicalCenter.model.Patient;
import medicalCenter.model.Person;

public class PatientStorage {
    private Patient[] patients = new Patient[10];
    private int size;

    public void add(Patient patients) {
        if (size == this.patients.length) {
            extend();
        }
        this.patients[size++] = patients;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.err.println(patients[i].getName() + " " + patients[i].getSurname() + " "
                    + patients[i].getPhoneNumber() + " " + patients[i].getDoctor().getName() + " " +
                    patients[i].getDoctor().getSurname() + " " + patients[i].getDate());
        }
    }

    private void extend() {
        Patient[] tmp = new Patient[size * 2];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients = tmp;
    }

    public void printByDoctor(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getDoctor().getId().equals(doctorId)) {
                System.err.println(patients[i].getName() + " " + patients[i].getName() + " " + patients[i].getPhoneNumber());
            }
        }
    }
}