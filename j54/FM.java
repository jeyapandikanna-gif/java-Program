import java.util.Scanner;

class FM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        FactorialTemplate obj = new FactorialTemplate();

        int result = obj.factorial(num);

        System.out.println("Factorial = " + result);
    }
}