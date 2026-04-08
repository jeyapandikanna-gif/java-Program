
package invaliduseridexception;

import java.util.Scanner;

public class InvalidUserIdException extends Exception
{
    public InvalidUserIdException(String message) {
        super(message);
    }
}

public class UserIdValidation {

    // Method to validate User ID
    public static void validateUserId(String input) throws InvalidUserIdException {
        try {
            int userId = Integer.parseInt(input);

            if (userId <= 0) {
                throw new InvalidUserIdException("User ID must be positive");
            }

            System.out.println("Valid User ID: " + userId);

        } catch (NumberFormatException e) {
            System.out.println("User ID must be a number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String input = sc.nextLine();

        try {
            validateUserId(input);
        } catch (InvalidUserIdException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
   