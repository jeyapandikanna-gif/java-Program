import java.util.Scanner;
class Array12
{
int[]arr=new int[10];

public static void main(String[] args)
    {
        Array12 obj = new Array12();
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
            System.out.println("3. Count Positive Numbers");
            System.out.println("4. Count Negative Numbers");
            System.out.println("5. Count Zeros");
            System.out.println("6. Exit");
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
                    countPositive();
                    break;

                case 4:
                    countNegative();
                    break;

                case 5:
                    countZero();
                    break;

                case 6:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Please enter valid option");
            }

        } while(option != 6);
    }

    void enterNumbers(Scanner sc)
    {
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i < 10; i++)
            arr[i] = sc.nextInt();
    }

    void displayNumbers()
    {
        for(int i = 0; i < 10; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void countPositive()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(arr[i] > 0)
                count++;

        System.out.println("Positive numbers = " + count);
    }

    void countNegative()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(arr[i] < 0)
                count++;

        System.out.println("Negative numbers = " + count);
    }

    void countZero()
    {
        int count = 0;
        for(int i = 0; i < 10; i++)
            if(arr[i] == 0)
                count++;

        System.out.println("Zero count = " + count);
    }
	}