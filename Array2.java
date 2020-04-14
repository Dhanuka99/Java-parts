class Array2
{
	public static void main(String args[])
	{	
		//first Array
		int[][] firstArray = new int[2][3];
		firstArray[0][0] = 10;
		firstArray[0][1] = 20;
		firstArray[0][2] = 30;
		firstArray[1][0] = 40;
		firstArray[1][1] = 50;
		firstArray[1][2] = 60;
		System.out.println("Print of our First Array");
		for (int i = 0;i<2 ;i++)
		 {
			for (int j = 0; j<3 ;j++)
			{
				System.out.print(firstArray[i][j]+ " ");
			}

		System.out.println();	
		}
		//second Array
		int[][] secondArray = new int[2][3];
		secondArray[0][0] = 70;
		secondArray[0][1] = 80;
		secondArray[0][2] = 90;
		secondArray[1][0] = 100;
		secondArray[1][1] = 110;
		secondArray[1][2] = 120;
		System.out.println("Print of our Second Array");
		for (int i = 0;i<2 ;i++)
		{
			for (int j = 0; j<3;j++ ) 
			{
				System.out.print(secondArray[i][j]+" ");
			}
		System.out.println();
		}
		//sum of array
		int[][] sum = new int[2][3];
		for (int i = 0;i<2;i++ ) 
		{
			for (int j=0;j<3 ;j++ )
			{
				sum[i][j] = firstArray[i][j] + secondArray[i][j];
			}
		
			
		}
		System.out.println("Print sum of  Arrays");
		//print the sum
		for (int i = 0;i<2 ;i++)
		{
			for (int j = 0; j<3;j++ ) 
			{
				System.out.print(sum[i][j]+" ");
			}
		System.out.println();
		}
		//min array
		int[][] min = new int[2][3];
		for (int i = 0;i<2;i++ ) 
		{
			for (int j=0;j<3 ;j++ )
			{
				min[i][j] = firstArray[i][j] - secondArray[i][j];
			}
		
			
		}
		System.out.println("Print min of  Arrays");
		//print the min
		for (int i = 0;i<2 ;i++)
		{
			for (int j = 0; j<3;j++ ) 
			{
				System.out.print(min[i][j]+" ");
			}
		System.out.println();
		}
	}
}