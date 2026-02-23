import java.util.Scanner;

public class TypeConversionMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Type Conversion Menu ----");
            System.out.println("1. int → double");
            System.out.println("2. double → int");
            System.out.println("3. char → int");
            System.out.println("4. int → char");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter an integer: ");
                    int i = sc.nextInt();
                    double d = i;   // implicit casting
                    System.out.println("Converted double value: " + d);
                    break;

                case 2:
                    System.out.print("Enter a double value: ");
                    double d1 = sc.nextDouble();
                    int i1 = (int) d1;   // explicit casting
                    System.out.println("Converted int value: " + i1);
                    break;

                case 3:
                    System.out.print("Enter a character: ");
                    char ch = sc.next().charAt(0);
                    int ascii = ch;   // implicit casting
                    System.out.println("ASCII value: " + ascii);
                    break;

                case 4:
                    System.out.print("Enter an integer: ");
                    int num = sc.nextInt();
                    char ch1 = (char) num;   // explicit casting
                    System.out.println("Converted character: " + ch1);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}