package test;

public class Star {
	
	static int a=41;
	
	 void Hello()
	{
		  
	    a=15;
		a=17;
		
		System.out.println(a);
		System.out.println("hello");
		
	}
	 
	 static void Good()
	{
		 int b=20;
		
		System.out.println(b);
		System.out.println("hi");
		
	}
	 
	 
	 Star()
	 {
		 int a=14;
		 System.out.println(a);
		 System.out.println("nicde");
	 }
	 
	 
	 Star(int g)
	 {
		 int a=14;
		 System.out.println(a);
		 System.out.println("nice to talk you");
	 }
	 
	public static void main(String[]args)
	{
		int c=14;
		
		
		
		 Star x=new Star();
		 
		 Star y=new Star();
		 
		 
		 y.Hello();
		 x.Hello();
		 Good();
		 System.out.println(c);
		 new Star();
		 new Star(58);
	
	}

}
