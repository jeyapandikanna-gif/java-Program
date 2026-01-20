class SwappingTwoNumbers
{
	static void swap(int a, int b)
	{
    int temp = a;
    a = b;
    b = temp;
    System.out.print("After swapping:");
    System.out.println(a+" "+b);
	}
	public static void main(String[] args)
	{
	   int a=10;
	   int b=20;
       swap(a,b);
	}
}