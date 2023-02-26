package test;

public class Lcm {
	
	
	public static void main(String[]args)
	{  
		int a=10;
		int b=30;
	
		int hcf=0;
		for(int c=1;c<=a || c<=b;c++)
			if(a%c==0)
			{
				if(b%c==0)
				{
					hcf=c;
				}
			}
		System.out.println("The HCF of "+a+ " and " +b+" is "+ hcf);
		
			
		


		
		
	
	}


}
