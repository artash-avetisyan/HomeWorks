package employee;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("0 for exit");
            System.out.println("1 add employee");
            System.out.println("2 print all employee");
            System.out.println("3 search employee by employee ID");
            System.out.println("4 search employee by company name");
            String command = scanner.nextLine();

            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Input name:");
                    String name = scanner.nextLine();
                    System.out.println("Input surname:");
                    String surname = scanner.nextLine();
                    System.out.println("Input ID:");
                    String idEmployee = scanner.nextLine();
                    System.out.println("Input salary:");
                    Double salary = Double.parseDouble(scanner.nextLine());
                    System.out.println("Input company");
                    String company = scanner.nextLine();
                    System.out.println("Input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, idEmployee, salary.doubleValue(), company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee created");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    String id = scanner.nextLine();
                    employeeStorage.searchId(id);
                    break;
                case "4":
                    String companyName = scanner.nextLine();
                    employeeStorage.searchByCompany(companyName);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}