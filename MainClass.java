import java.util.*;
class MyClass
{
	public static void myMethod()
	{
		System.out.println("myMethod of MyClass");	
	}
	
}
class Example
{
	public static void myMethod()
	{
		System.out.println("myMethod of Example");	
	}
	public static void main(String args[])
	{
		myMethod(); //call "myMethod()" of Example
		Example.myMethod(); //call "myMethod()" of Example
		
		MyClass.myMethod(); //call "myMethod()" of MyClass
	}
	
}
----------------------------------------------------->
import java.util.*;
class MyClass{
	//------------------Start method declaration---------------
	public static void myMethod(){
		System.out.println("hello myMethod...");	
	}
	//------------------End method declaration---------------	
}
class Example{
	//------------------Start main method declaration---------------
	public static void main(String args[]){
		//myMethod(); //Illegal
		MyClass.myMethod(); //calling..
	}
	//------------------End main method declaration---------------
}

-------------------------------------------------------->

import java.util.*;
class Example{
	//------------------Start method declaration---------------
	public static void myMethod(){
		System.out.println("hello myMethod...");	
	}
	//------------------End method declaration---------------
	
	//------------------Start main method declaration---------------
	public static void main(String args[]){
		myMethod(); //Method Calling Statement
	}
	//------------------End main method declaration---------------
}

------------------------------------------------------->

import java.util.*;
class Example{
	//------------------Start method declaration---------------
	public static void myMethod(){
		System.out.println("hello myMethod...");	
	}
	//------------------End method declaration---------------
	
	//------------------Start main method declaration---------------
	public static void main(String args[]){

	}
	//------------------End main method declaration---------------
}