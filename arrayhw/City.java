import java.util.Scanner;
class City
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String[][] cities = new String[4][3];
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
				System.out.print("Enter the value of "+ i +","+ j +" index : ");
                cities[i][j] = sc.next();
            }
        }
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 3; j++) 
			{
                System.out.print(cities[i][j] + " ");
            }
            System.out.println();
        }
    }
}