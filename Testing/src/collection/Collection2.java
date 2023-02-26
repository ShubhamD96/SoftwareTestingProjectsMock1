package collection;

public class Collection2<G,T> {
	
	G g;
	T t;
	G  demo(T c)
	{
		 System.out.println(g);
		 return g;
	}
	public static void main (String[]args)
	{
		
		Collection2<String,Integer> x=new Collection2<String,Integer>();
		x.g="Happy";
		 System.out.println(x.g);
		x.t=74;
		 System.out.println(x.t);
		x.g="Morning";
		 System.out.println(x.g);
		x.t=87;
		 System.out.println(x.t);
		 Collection2<Float,Character> y=new Collection2<Float,Character>();
		 y.g=45.4f;
		 System.out.println(y.g);
		 y.t='v';
		 System.out.println(y.t);
		 
		 Collection2<String ,Character> sc=new Collection2<String,Character>();
		 //sc.g="Be Happy";
		// System.out.println(sc.g);
	   //   String data=sc.demo('d');
	 //	System.out.println(data);
	
	}
	

}
