package medicalCenter.model;

public class Doctor extends Person {
    private String email;
    private String profession;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}