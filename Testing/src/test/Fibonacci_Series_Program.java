package test;

import java.util.Scanner;

public class Fibonacci_Series_Program {
	
	public static void main(String[]args)
	{
	int first_number;
	int second_number;
	int last_number;
	int add;
	
	System.out.println("Enter first number");
	Scanner r= new Scanner(System.in);
	
	first_number= r.nextInt();
	
	System.out.println("The first number is "+  first_number);
	
	System.out.println("Enter second number");
	Scanner r1= new Scanner(System.in);
	
	second_number= r1.nextInt();
	System.out.println("The second  number is "+ second_number);
	System.out.println("Enter last number");
	Scanner r2= new Scanner(System.in);
	
	 last_number= r2.nextInt();
	
	
	System.out.println("The last  number is "+ last_number );
	for(int i=1;i<=last_number;i++)
	{
		System.out.println(first_number);
		
		add=first_number+ second_number;
		first_number=second_number;
		second_number=add;
		
	}
	
}
}
