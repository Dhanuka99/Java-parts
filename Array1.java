class Array1
{
	public static void main(String args[])
	{
		int sum = 0;
		int[][] fmyArray = {{1,2,3,4},{5,6,7,8}};
		int[][] smyArray = new int[2][4];
		//------------>
		int[][] sumarray = new int[2][4];
		int[][] minarray = new int[2][4];

		smyArray[0][0] = 4;
		smyArray[0][1] = 2;
		smyArray[0][2] = 3;
		smyArray[0][3] = 4;
		smyArray[1][0] = 4;
		smyArray[1][1] = 4;
		smyArray[1][2] = 4;
		smyArray[1][3] = 4;
		System.out.println("First Array print");
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				System.out.print(fmyArray[i][j]+" ");
			}
			
		System.out.println();
		}
		System.out.println("Second Array print");
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				System.out.print(smyArray[i][j]+" ");
			}
			
		System.out.println();
		}
		//sum array
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				sumarray[i][j] = fmyArray[i][j]+smyArray[i][j];
			}
			
		
		}
		System.out.println("Sum array");
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				System.out.print(sumarray[i][j]+" ");
			}
			
		System.out.println();
		//------------------minarray---------------->
		}
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				minarray[i][j] = fmyArray[i][j]-smyArray[i][j];
			}
			
		
		}
		
		System.out.println("MIN array");
		for (int i= 0;i<2 ;i++)
		{
			for (int j = 0;j<4 ;j++ ) 
			{
				System.out.print(minarray[i][j]+" ");
			}
			
		System.out.println();
		}
	}

}