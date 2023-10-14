package medicalCenter.model;

import java.util.Date;

public class Patient extends Person {
    private Doctor doctor;
    private Date date;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String phone, Date date, Doctor doctor) {
        super(id, name, surname, phone);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phone;
        this.doctor = doctor;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
