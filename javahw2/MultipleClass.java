import java.util.Scanner;
public class MultipleCheck
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		if(num%3==0||num%7==0)
		{
			System.out.println("The number is Multiple of 3 or 7);
		}
		else
		{
			System.out.println("The number is Not a multiple of 3 or 7");
		}
	}
}
			
		