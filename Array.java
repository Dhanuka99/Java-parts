class Array
{
	public static void main(String args[])
	{
		int[] myArray = {10,20,30,40,50};
		ArrayTest(myArray);
	}
	public static void ArrayTest(int[] value)
		{
			int sum = 0;
			for (int i=0;i<5 ; i++) 
			{
			sum = sum + value[i];
			
			}
			System.out.println(sum);
		}
}