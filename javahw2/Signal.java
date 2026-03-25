import java.util.Scanner;
class Signal
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		{
			System.out.print("signal:");
			String signal=sc.nextLine();
			switch(signal)
			{
				case "red":
				{
					System.out.println("stop");
					break;
			    }
				case "green":
				{
					System.out.println("go");
					break;
			    }
				case "yellow":
				{
					System.out.println("get ready");
					break;
			    }
	
				
				default:
				{
					System.out.println("INVALID");
				}
			}
			
		}
	}		
				
}				
				
				
				
					