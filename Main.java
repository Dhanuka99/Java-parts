public class Main 
{
	public static void main(String args[])
	{	
		int sum = add(10,30);
		System.out.println("Total is : " + sum);
		//----------------------------->

		A ob = new A();
		int re = ob.min(100,50);
		System.out.println("Minimum Value is : " + re);
		//------------------------------>

		B ob1 = new B();
		int value = ob1.max(172,329);
		System.out.println("MAX Value is : " + value);
	}
	public static int add(int num1,int num2)
	{
		int tot;
		tot = num1+num2;
		return tot;
	}
}
class A
{
	public int min(int num3,int num4)
	{
		int t = num4 - num3;
		return t;
	}
}
class B
{
	public int max(int num5, int num6)
		{
			int maxnumber = 0;
			if(num5>num6)
			{
				maxnumber = num5;
			}
			else
			{
				maxnumber = num6;
			}
			return maxnumber;
		}
}

