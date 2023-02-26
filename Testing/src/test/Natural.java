package test;

public class Natural {
	
	public static void main(String []args)
	{  
		int num=29;
		int n;
		int count=0;
			for( n=1;n<num;n++)
				if(num%n==0)
				{
					count++;	
				}
			if(count==1)
			{
				System.out.println("It is a prime number");
			}
			else
			{
				System.out.println("It is  not a prime number");
			}  
	}
}
