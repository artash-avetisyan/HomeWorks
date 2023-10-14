package medicalCenter;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.model.Person;
import medicalCenter.storage.DoctorStorage;
import medicalCenter.storage.PatientStorage;

import java.util.Date;
import java.util.Scanner;

public class MedicalCenterMain {
    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatientWithDoctor();
                    break;
                case "6":
                    printPatientsByDoctor();
                    break;
                case "7":
                    printAllPatients();
                    break;
                default:
                    System.err.println("Invalid command!");
            }
        }
    }

    private static void printAllPatients() {
        patientStorage.print();
    }

    private static void printPatientsByDoctor() {
        System.out.println("Please choose doctor id");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Person doctor = doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.err.println("Doctor with " + doctorId + " does not exists");
            return;
        }
        patientStorage.printByDoctor(doctorId);
    }

    private static void addPatientWithDoctor() {
        System.out.println("Please choose doctor id");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctor = (Doctor) doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.err.println("Doctor with " + doctorId + " does not exists");
            return;
        }
        System.out.println("Please input id");
        String id = scanner.nextLine();
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input phone");
        String phone = scanner.nextLine();
        Date date = new Date();
        Patient patient = new Patient(id, name, surname, phone, date, doctor);
        patientStorage.add(patient);
        System.err.println("Patient added");
    }

    private static void changeDoctorById() {
        System.out.println("Choose doctor id");
        doctorStorage.print();
        System.err.println("Please inputit ID");
        String doctorId = scanner.nextLine();
        Doctor doctor = (Doctor) doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.err.println("Doctor with " + doctorId + " does not exists");
            return;
        }
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input phone");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        doctor.setName(name);
        doctor.setSurname(surname);
        doctor.setEmail(email);
        doctor.setPhoneNumber(phoneNumber);
        doctor.setProfession(profession);
        System.err.println("Doctor updated!");

    }

    private static void deleteDoctorById() {
        System.out.println("Please choose doctor ID");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Person doctor = doctorStorage.getById(doctorId);
        if (doctor == null) {
            System.err.println("Doctor with " + doctorId + " does not exists");
            return;
        }
        doctorStorage.deleteById(doctorId);
        System.err.println("Doctor deleted");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String doctorProfession = scanner.nextLine();
        Doctor doctorByProfession = (Doctor) doctorStorage.findByProfession(doctorProfession);
        if (doctorByProfession == null) {
            System.err.println("there is no such profession");
        }
    }

    private static void addDoctor() {
        System.out.println("Please input doctor Id");
        String doctorId = scanner.nextLine();
        Doctor doctorStorageId = (Doctor) doctorStorage.getById(doctorId);
        if (doctorStorageId != null) {
            System.err.println("Doctor with " + doctorId + " already exists");
            return;
        }
        System.out.println("Please input name");
        String name = scanner.nextLine();
        System.out.println("Please input surname");
        String surname = scanner.nextLine();
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input phone");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        Doctor doctor = new Doctor(doctorId, name, surname, email, phoneNumber, profession);
        doctorStorage.add(doctor);
        System.err.println("Doctor added!");
    }

    private static void printCommands() {
        System.out.println("Please input 0 for EXIT");
        System.out.println("Please input 1 for ADD DOCTOR");
        System.out.println("Please input 2 for SEARCH DOCTOR BY PROFESSION");
        System.out.println("Please input 3 for DELETE DOCTOR BY ID");
        System.out.println("Please input 4 for CHANGE DOCTOR BY ID");
        System.out.println("Please input 5 for ADD PATIENT");
        System.out.println("Please input 6 for PRINT ALL PATIENTS BY DOCTOR");
        System.out.println("Please input 7 for PRINT ALL PATIENTS");
    }
}