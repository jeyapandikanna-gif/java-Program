import java.util.Scanner;

public class Results 
{

    // Global variables (static)
    static int mark1, mark2, mark3;
    static int total;
    static double percentage;

    // Function to input marks
    static void inputMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = sc.nextInt();
    }

    // Function to calculate total
    static void calculateTotal() {
        total = mark1 + mark2 + mark3;
        System.out.println("Total Marks = " + total);
    }

    // Function to calculate percentage
    static void calculatePercentage() {
        total = mark1 + mark2 + mark3;
        percentage = total / 3.0;
        System.out.println("Percentage = " + percentage);
    }

    // Function to display result
    static void displayResult() {
        percentage = (mark1 + mark2 + mark3) / 3.0;

        if (percentage >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");
    }

    // Function to display grade
    static void displayGrade() {
        percentage = (mark1 + mark2 + mark3) / 3.0;

        if (percentage >= 75)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }

    // Main method with menu
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        inputMarks();   // Input once at start

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Display Total");
            System.out.println("2. Display Percentage");
            System.out.println("3. Display Result");
            System.out.println("4. Display Grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    calculateTotal();
                    break;
                case 2:
                    calculatePercentage();
                    break;
                case 3:
                    displayResult();
                    break;
                case 4:
                    displayGrade();
                    break;
                case 5:
                    System.out.println("Exiting Program...");
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }

        } while (choice != 5);
    }
}