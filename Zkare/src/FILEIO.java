import java.io.*;
import java.util.*;

class Employee {
    private int code;
    private String name;
    private double salary;

    public Employee(int code, String name, double salary) {
        this.code = code;
        this.name = name;
        this.salary = salary;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Salary: $" + salary;
    }
}

public class FILEIO {
    private static List<Employee> employees = new ArrayList<>();
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        loadEmployeesFromFile();

        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("\nEmployee Management System Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Promote Salary");
            System.out.println("4. List Employees");
            System.out.println("5. Save to File");
            System.out.println("6. Quit");
            System.out.print("Enter your choice (1-6): ");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    removeEmployee(sc);
                    break;
                case 3:
                    promoteSalary(sc);
                    break;
                case 4:
                    listEmployees();
                    break;
                case 5:
                    saveEmployeesToFile();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    break;
            }
        }

        sc.close();
    }

    private static void loadEmployeesFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int code = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                double salary = Double.parseDouble(parts[2].trim());
                employees.add(new Employee(code, name, salary));
            }
            System.out.println("Employees loaded from file.");
        } catch (IOException e) {
            System.out.println("Error loading employees from file: " + e.getMessage());
        }
    }

    private static void saveEmployeesToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Employee employee : employees) {
                writer.write(employee.getCode() + ", " + employee.getName() + ", " + employee.getSalary());
                writer.newLine();
            }
            System.out.println("Employees saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving employees to file: " + e.getMessage());
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter employee code: ");
        int code = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = scanner.nextDouble();
        employees.add(new Employee(code, name, salary));
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee(Scanner scanner) {
        System.out.print("Enter employee code to remove: ");
        int codeToRemove = scanner.nextInt();
        boolean removed = employees.removeIf(employee -> employee.getCode() == codeToRemove);
        if (removed) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void promoteSalary(Scanner scanner) {
        System.out.print("Enter employee code to promote salary: ");
        int codeToPromote = scanner.nextInt();
        scanner.nextLine();  // Consume newline character
        System.out.print("Enter the salary increase amount: ");
        double increaseAmount = scanner.nextDouble();

        for (Employee employee : employees) {
            if (employee.getCode() == codeToPromote) {
                double newSalary = employee.getSalary() + increaseAmount;
                employee.setSalary(newSalary);
                System.out.println("Salary promoted successfully.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    private static void listEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("Employee List:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}
