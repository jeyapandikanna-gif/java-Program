import java.util.Random;
import java.util.Scanner
package numberguessinggame;


public class NumberGuessingGame {

    
    public static void main(String[] args)
    {
         Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int number = rand.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("Guess a number between 1 and 100:");

        while (attempts < maxAttempts) {
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too High");
            } 
            else if (guess < number) {
                System.out.println("Too Low");
            } 
            else {
                System.out.println("Correct! You won in " + attempts + " attempts.");
                break;
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Game Over! The correct number was " + number);
        }

        sc.close();
    }
}
    
    

