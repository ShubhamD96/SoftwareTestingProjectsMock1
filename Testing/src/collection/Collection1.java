package collection;

public class Collection1<T> {
	
	int a=5;
	T t;
	
	public static void main(String[]args)
	{
		 Collection1 z = new  Collection1 ();
		 System.out.println(z.a);
		 z.t="Hello";
		 System.out.println(z.t);
		 z.t=45;
		 System.out.println(z.t);
		 z.t=45.145f;
		 System.out.println(z.t);
		 z.t='c';
		 System.out.println(z.t);
		
		 Collection1<String> s = new  Collection1<String> ();
		 s.t="Hello";
		 System.out.println(s.t);
		 s.t="Hi";
		 System.out.println(s.t);
		// s.t='c'; only allow string type data
		// s.t=78.9;
		 s.t="Good";
		 System.out.println(s.t);
		 s.t="Excellent";
		 s.t="Nice";
		 System.out.println(s.t);
		 
		 
	
		 
	}

}
