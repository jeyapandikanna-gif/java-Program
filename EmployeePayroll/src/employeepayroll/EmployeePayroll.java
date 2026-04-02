
package employeepayroll;
import java.util.*;

class Employee {
    int id;
    String name;
    String department;
    double basicSalary;

    Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Dept: " + department + ", Basic Salary: " + basicSalary);
    }
}

public class EmployeePayroll {
    static ArrayList<Employee> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- Employee Payroll System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View All");
            System.out.println("3. Search by ID");
            System.out.println("4. Update Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: addEmployee(); break;
                case 2: viewAll(); break;
                case 3: searchEmployee(); break;
                case 4: updateSalary(); break;
                case 5: calculateSalary(); break;
                case 6: deleteEmployee(); break;
                case 7: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 7);
    }

    static void addEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.println("ID already exists!");
                return;
            }
        }

        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double salary = sc.nextDouble();

        list.add(new Employee(id, name, dept, salary));
        System.out.println("Employee Added!");
    }

    static void viewAll() {
        if (list.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }

        for (Employee e : list) {
            e.display();
        }
    }

    static void searchEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                e.display();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void updateSalary() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                System.out.print("Enter new salary: ");
                e.basicSalary = sc.nextDouble();
                System.out.println("Salary Updated!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void calculateSalary() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Employee e : list) {
            if (e.id == id) {
                double net = e.calculateNetSalary();
                System.out.println("Net Salary: " + net);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    static void deleteEmployee() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        Iterator<Employee> it = list.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            if (e.id == id) {
                it.remove();
                System.out.println("Employee Deleted!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
