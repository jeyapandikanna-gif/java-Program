import java.util.Scanner;
class Grade
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.println("Grade:");
			char num=sc.next().charAt(0);
			switch(num)
			{
				case 'A':
				{
					System.out.println("Excellent");
					break;
			    }
				case 'B':
				{
					System.out.println("Good");
					break;
			    }
				case 'C':
				{
					System.out.println("Satisfactory");
					break;
			    }
				case 'D':
				{
					System.out.println("Need imporvement");
					break;
			    }
				default:
				{
					System.out.println("Fail");
				}
			}
			
		}
	}		
				
}				
				
				
				
					