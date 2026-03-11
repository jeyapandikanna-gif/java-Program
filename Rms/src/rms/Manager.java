
package rms;


public class Manager extends Employee
{
     String department;

    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary); // call base class constructor
        this.department = department;
    }

    // Override displayInfo()
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
        System.out.println("Department: " + department);
    }
}
}
