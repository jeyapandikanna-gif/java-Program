import java.util.Scanner;
class Ticket
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("ticket num:");
			int num=sc.nextInt();
			switch(num)
			{
				case 1:
				{
					System.out.println("General ticket rate was 400");
					break;
			    }
				case 2:
				{
					System.out.println("sleeper ticket rate was 750");
					break;
			    }
				case 3:
				{
					System.out.println("Ac3 Tier ticket  rate was 1200");
					break;
			    }
				case 4:
				{
					System.out.println("Ac4 Tier ticket rate was 1600");
					break;
			    }
				case 5:
				{
					System.out.println("First class ticket rate was 2000");
					break;
			    }
	
				
				default:
				{
					System.out.println("tickets not available");
				}
			}
			
		}
	}		
				
}				
				
				
				
					