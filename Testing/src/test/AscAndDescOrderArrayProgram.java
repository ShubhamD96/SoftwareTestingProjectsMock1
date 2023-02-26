package test;

public class AscAndDescOrderArrayProgram {
	
	public static void main(String[]args)
	{
		int a[]= {10,2,3,5};
		for(int b=0;b<a.length-1;b++)
			if(a[b]>a[b+1])
			{
				int c=a[b];
				a[b]=a[b+1];
				a[b+1]=c;
				
			}
		System.out.println( " Ascending order program ");
		for(int b=0;b<a.length;b++)
			
		System.out.print(a[b]+ " ,");

		System.out.println();
		System.out.println( " Decending order program ");
		for(int b=a.length-1;b>=0;b--)
			System.out.print(a[b]+ " ,");
		
	}

}
