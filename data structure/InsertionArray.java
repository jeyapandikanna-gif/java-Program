class InsertionArray
{
    public static void main(String[] args)
    {
        int arr[] = {5,10,20,30,40,50,25,3};
        int newarr[] = new int[arr.length + 1];
        int insertelement = 25;
        int indexvalue = 3;
        for(int i = 0; i < indexvalue; i++)
        {
            newarr[i] = arr[i];
        }
        newarr[indexvalue] = insertelement;
        for(int i = indexvalue; i < arr.length; i++)
        {
            newarr[i + 1] = arr[i];
        }
        for(int i = 1; i < 7; i++)
        {
            System.out.print(newarr[i] + " ");
        }
    }
}