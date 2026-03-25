import.java.util.Scanner;
class Calculate;
{
public Static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter electricity units:");
int units=sc.nextInt();
int bill=0;
if(units<=100)
{
	bill=units*5;
}
else if(units<=200)
{
	bill=(100*5)+(units-100)*7;
}
else
{
	bill=(100*5)+(100*7)+(units-200)*10;
}
   System.out.println("Today Electricity bill-$"+bill);
}
}
