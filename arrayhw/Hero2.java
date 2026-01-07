class Hero2
{
	public static void main(String[] args)
	{
		String name[][]={{"V","I","J","A","Y"},{"A","J","I","T","H"},{"K","A","M","A","L"},{"S","I","M","B","U"}};
		for(int i=0;i<name.length;i++)
		{
			for(int j=0;j<name[i].length;j++)
			{
				System.out.print(name[i][j] +" ");
			}
			System.out.println();
		}
	}
	
}