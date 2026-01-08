import java.util.Scanner;
class EmployeeManagement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
	
		System.out.print("Enter the total no of Employee : ");
		int no_of_emp = sc.nextInt();
		
		String Employee_name[]=new String [no_of_emp];
		
		int choice;
		int index = 0;
		do
		{
			System.out.print("1.Add Student Name\n2.See the Student List\n3.Exit\n Enter your choice");
			System.out.println("");
			
			
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						if(index<Employee_name.length)
						{
							System.out.println("Enter Name for Employee"+(index+1));
							
							Employee_name[index]=sc1.nextLine();
							index++;
							break;
						}
						else
						{
							
								System.out.println("Employee list id full");
						}
						
				case 2:
				
						for(int i = 0;i<Employee_name.length;i++)
						{
							if(Employee_name[i]!=null)
							{
								System.out.println(Employee_name[i]+" ");
							}
						}
						
						break;
						
				case 3 :
						break;
				default:
							System.out.print("Enter the correct choice... ");
				
						
			}
			
		}while(choice!=3);
	}
}