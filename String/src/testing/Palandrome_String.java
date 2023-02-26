package testing;

import java.util.Scanner;

public class Palandrome_String {
	public static void main(String[]args)
	{
		
		System.out.println("Enter your String");
		Scanner a=new Scanner(System.in);
		String b=a.nextLine();
		System.out.println(b);
		String d="";
		
		for(int c=b.length()-1;c>=0;c--)
		{
			d=d+b.charAt(c);
		}
	   b=d;
	   System.out.println(b);
	   
	}
}
