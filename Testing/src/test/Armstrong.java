package test;

public class Armstrong {
	public static void main(String[]args)
	{
		int n,arm=0,rem,c;
		n=371;      //3 digit Armstrong numbers are 153,371  
		c=n;        // Armstrong  means 371==1*1*1*1+7*7*7+1*1*1
		while(n>0)  // 371==371
		{
			rem=n%10;
			//  calculate no of length
			arm=(rem*rem*rem)+arm;
			n=n/10;
			
		}
		if(c==arm)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
		
	}
	
	
}
