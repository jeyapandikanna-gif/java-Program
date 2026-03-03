class InsertElement
{
	public static void main(String []args)
	{
		int[]arr={10,20,25,30,40,50};
		int []newarr=new int[arr.length+2];
		newarr[0]=5;
		for(int i=0;i<arr.length;i++)
		{
			newarr[i+1]=arr[i];
		}
		newarr[newarr.length-1]=3;
		System.out.println("New array:");
		for(int i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]+"");
		}
	}
}
		