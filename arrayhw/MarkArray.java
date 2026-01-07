class MarkArray
{
	public static void main(String[] args)
	{
		int ar[][] = {{85,78,90},{88,92,80},{70,75,68}};
		
		for(int i =0;i<ar.length;i++)
		{
			for(int j = 0; j<ar[i].length;j++)
			{
				System.out.print(ar[i][j] + "  ");
			}
			
				System.out.println("");
			
		}
	}
}