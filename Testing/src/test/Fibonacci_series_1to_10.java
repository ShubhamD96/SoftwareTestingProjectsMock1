package test;

import java.util.Scanner;

public class Fibonacci_series_1to_10 {
	public static void main(String[]args)
	{
	int a=0;
	int b=1;
	int c;
	int last_number;
	 System.out.println("Enter last number");
	Scanner s=  new Scanner(System.in);
	
	  last_number = s.nextInt();
	  for(int i=1;i<=last_number;i++)
	  {
		  System.out.println(a); 
		  c=a+b;
		  a=b;
		  b=c;
		  
	  }
			
			
			
	}
}
