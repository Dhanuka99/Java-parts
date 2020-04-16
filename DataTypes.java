class DataTypes
{

public static void main(String args[])
	{	
	IfState test = new IfState();
	test.True();
	}
}
class IfState
{
public void True()
{
	int age = 19;
	if(age == 20)
		{
		System.out.println("Age is 20..He is Adult");
		}
		else if(age==19)
		{	
		System.out.println("Age is 19..He is not Adult");
		}

		}
	
}