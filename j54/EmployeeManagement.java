import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] empIds = new int[100];   // Array to store employee IDs
        int count = 0;                 // Number of employees
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:   // Add employee ID
                    if (count < empIds.length) {
                        System.out.print("Enter employee ID: ");
                        int id = sc.nextInt();
                        empIds[count] = id;
                        count++;
                        System.out.println("Employee ID added.");
                    } else {
                        System.out.println("Employee list is full.");
                    }
                    break;

                case 2:   // Remove employee ID
                    if (count == 0) {
                        System.out.println("No employee IDs to remove.");
                        break;
                    }

                    System.out.print("Enter employee ID to remove: ");
                    int removeId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empIds[i] == removeId) {
                            // Shift elements left
                            for (int j = i; j < count - 1; j++) {
                                empIds[j] = empIds[j + 1];
                            }
                            count--;
                            found = true;
                            System.out.println("Employee ID removed.");
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee ID not found.");
                    }