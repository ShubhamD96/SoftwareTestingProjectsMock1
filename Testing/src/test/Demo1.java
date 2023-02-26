package test;

public class Demo1 {
	public static void main (String[]args)
	{
		int a,b;
		int count=0;
		for(a=1;a<=100; a++)
		{
			for( b=2;b<=a;b++)
			{
				if (a%b==0)
					break;
			}
			if (a==b)
			{
			System.out.println(b);
			count++;
			}
			
		
				
		}
		
		
		System.out.println("The total  prime numbers are "+ count);
	}		
}
