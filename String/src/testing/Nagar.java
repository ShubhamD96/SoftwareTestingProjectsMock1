package testing;

public class Nagar {
	
	static String f="hello good morning";
	static String i="hello good morning";
	public static void main(String[]args)
	{
		String a="Velocity";
		String b="Velocity";
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		String c=new String("Velocity");
		String d=new String("Velocity");
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(a==b);// Address comparison
		System.out.println(b==a);// Address comparison
		System.out.println(a==c);// Address comparison
		System.out.println(a==d);// Address comparison
		System.out.println(b==c);// Address comparison
		System.out.println(b==d);// Address comparison
		int x=10;
		int y=10;
		
		System.out.println(x==y);// data compare not address
		System.out.println("=======");
		boolean result=a.equals(c);
		System.out.println(result);
		System.out.println("=======");
		boolean results=c.equals(a);
		System.out.println(results);
		
		System.out.println("==========");
		 String e="hello";
		System.out.println(e);
		System.out.println(f);
		 boolean res =f.equals(i);
		 System.out.println(res);
		 
		
		
		
		
		
		
		
	}

}
