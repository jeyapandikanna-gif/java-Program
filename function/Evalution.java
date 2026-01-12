import java.util.Scanner;
class Evalution
{
	Scanner sc=new Scanner(System.in);
	 static int mark1,mark2,mark3;
	 static int total;
	 static float percentage;
	
	void inputmarks()
	{
		System.out.print("Enter your Mark1:");
		mark1=sc.nextInt();
	    System.out.print("Enter your Mark2:");
		mark2=sc.nextInt();
	    System.out.print("Enter your Mark3:");
		mark3=sc.nextInt();
		
		
	}
	int calculate_total()
	{
	    total=mark1+mark2+mark3;
		return total;
	}
	float  calculate_percentage()
	{
	     percentage = (total * 100.0f) / 300;
         return percentage;
	}
    public static void main(String[] args)
	{
		Evalution evl=new Evalution();
		evl.inputmarks();  
		total=evl.calculate_total();
		percentage=evl.calculate_percentage();
		System.out.println("Your Total Marks is:"+total);
		System.out.println("Your Total percentage is:"+percentage);
	}
}