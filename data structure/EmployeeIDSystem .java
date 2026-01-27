import java.util.Scanner;

public class EmployeeList
{
    int[] empIds = new int[10];   
    int count = 0;              
    Scanner sc = new Scanner(System.in); 

    public static void main(String[] args)
    {
        EmployeeList obj = new EmployeeList();
        obj.menu();
    }

    public void menu()
    {
        int choice;

        do
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add employee ID");
            System.out.println("2. Remove employee ID");
            System.out.println("3. Display employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    addEmployee();
                    break;

                case 2:
                    removeEmployee();
                    break;

                case 3:
                    displayEmployees();
                    break;

                case 4:
                    System.out.println("Exiting.");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    
    public void addEmployee()
    {
        if (count < empIds.length)
        {
            System.out.print("Enter employee ID: ");
            empIds[count] = sc.nextInt();
            count++;
            System.out.println("Employee ID added.");
        }
        else
        {
            System.out.println("Employee list is full.");
        }
    }

    
    public void removeEmployee()
    {
        System.out.print("Enter employee ID to remove: ");
        int removeId = sc.nextInt();

        int index = linearSearch(removeId);

        if (index == -1)
        {
            System.out.println("Employee ID not found.");
        }
        else
        {
            shiftAfterDeletion(index);
            count--;
            System.out.println("Employee ID removed.");
        }
    }

   
    public int linearSearch(int value)
    {
        for (int i = 0; i < count; i++)
        {
            if (empIds[i] == value)
            {
                return i;
            }
        }
        return -1;
    }

   
    public void shiftAfterDeletion(int index)
    {
        for (int i = index; i < count - 1; i++)
        {
            empIds[i] = empIds[i + 1];
        }
    }

    
    public void displayEmployees()
    {
        if (count == 0)
        {
            System.out.println("No employee IDs.");
            return;
        }

        System.out.println("Employee IDs:");
        for (int i = 0; i < count; i++)
        {
            System.out.print(empIds[i] + " ");
        }
        System.out.println();
    }
}