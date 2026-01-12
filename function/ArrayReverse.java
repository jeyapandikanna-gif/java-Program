import java.util.Scanner;

class ArrayReverse
{
    int[] arr = new int[10];

    public static void main(String[] args)
    {
        ArrayReverse obj = new ArrayReverse();
        obj.mainMenu();
        System.out.println("Program Ended");
    }

    void mainMenu()
    {
        Scanner sc = new Scanner(System.in);
        int option;

        do
        {
            System.out.println("\n*** MAIN MENU ***");
            System.out.println("1. Enter Numbers");
            System.out.println("2. Display Numbers");
            System.out.println("3. Display Numbers in Reverse Order");
            System.out.println("4. Exit");
            System.out.print("Enter your option: ");

            option = sc.nextInt();

            switch(option)
            {
                case 1:
                    enterNumbers(sc);
                    break;

                case 2:
                    displayNumbers();
                    break;

                case 3:
                    displayReverse();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Please enter valid option");
            }

        } while(option != 4);
    }

    void enterNumbers(Scanner sc)
    {
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    void displayNumbers()
    {
        System.out.println("Array elements:");
        for(int i = 0; i < 10; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void displayReverse()
    {
        System.out.println("Array in reverse order:");
        for(int i = 9; i >= 0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}