package test;

public class ExceptionTryAndCatch {
	
	
	
/*	final  ExceptionTryAndCatch()
	{
		
	}*/
	
	public static void main (String[]args)
	{
		
		
		
		
		int a=5;
		int c=0;
		int d=0;	
		
		try {
			System.out.println("Good");
			d=a/c;
			System.out.println("Hi");
		}
		catch(ArithmeticException f)
		{
			c=1;
			
			d=a/c;
		}
		
		
		finally
		{
			System.out.println("Have a Nice Day");
			
		}
		
		
	
		
		
		System.out.println("hello1");
		System.out.println(d);
		System.out.println("hello1");
		
	}	
}
