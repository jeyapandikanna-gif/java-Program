import java.util.Scanner;
class Heross
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String[][] hero = new String[4][5];
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 5; j++) 
			{
				System.out.print("Enter the value of "+ i +","+ j +" index : ");
                hero[i][j] = sc.next();
            }
        }
        for (int i = 0; i < 4; i++) 
		{
            for (int j = 0; j < 5; j++) 
			{
                System.out.print(hero[i][j] + " ");
            }
            System.out.println();
        }
    }
}