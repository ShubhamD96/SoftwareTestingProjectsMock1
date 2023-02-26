package test;

public class Leaf {
	public static void main(String[]args)
	{
		
		int year=2022;
		if(year%4==0)
		{
			if(year%4==0)
			{
				System.out.println(year+ "  is a leaf year");
			}
			else
			{
				if(year%100!=0)
				{
					System.out.println(year+  " is a leaf year");
				}
				else
				
				{
					System.out.println(year+ " is not a leaf year");
				}
			}
		}
		else
		{
			System.out.println(year+" is not a leaf year");
		}
		
	}

}
