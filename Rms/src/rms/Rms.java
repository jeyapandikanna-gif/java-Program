
package rms;


public class Rms {

    
    public static void main(String[] args)
    {
         System.out.println("Employee Management System");
        System.out.println("--------------------------");

        // Create Employee object
        Employee e1 = new Employee("Alice", 50000);

        // Create Manager object
        Manager m1 = new Manager("Bob", 80000, "IT");

        // Display details
        e1.displayInfo();
        System.out.println();
        m1.displayInfo();
    }
}
        
    }
    
}
