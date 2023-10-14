package medicalCenter.storage;

import medicalCenter.model.Doctor;
import medicalCenter.model.Person;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctors) {
        if (size == this.doctors.length) {
            extend();
        }
        this.doctors[size++] = doctors;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.err.println(doctors[i].getId() + " " + doctors[i].getName() + " " + doctors[i].getSurname() + " " + doctors[i].getProfession() + " " + doctors[i].getPhoneNumber() + " " + doctors[i].getEmail());
        }
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size * 2];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public Person getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }

    public Person findByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().equals(doctorProfession)) {
                System.err.println(doctors[i].getName() + " " + doctors[i].getSurname() + " " + doctors[i].getPhoneNumber());
                return doctors[i];
            }
        }
        return null;
    }

    public void deleteById(String doctorId) {
        int indexById = getIndexById(doctorId);
        if (indexById == -1) {
            System.err.println("Wrong id");
        }
        for (int i = indexById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }

    private int getIndexById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }
}