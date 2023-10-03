package employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[size * 2];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public void searchId(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().equals(id)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }

    public void searchByCompany(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(companyName)) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }
}