import java.util.Scanner;
class  PrimeNumber
{
	public static void main(String[]args)
	{
	Scanner Sc=new Scanner(System.in);
	System.out.print("Enter a number:");
	int num=Sc.nextInt();
	int count=0;
	if(num<=1)
	{
		System.out.print(num+"is a Not a prime number");
	}
	else
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				 int cout++;
			}
		}
		if(cout==2)
		{
			System.out.println(num+"is a PRIME number");
		}
		else
		{
			System.out.println(num+"is NOT a prime number");
		}
	}
	}
}


	