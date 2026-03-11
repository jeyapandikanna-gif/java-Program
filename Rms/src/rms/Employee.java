
package rms;


public class Employee 
{
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: Rs. " + salary);
    }
}
    

