package collection;

public class GeneartionInMethod<G,T> {
	
	G g;
	G  demo(T c)
	{
		 System.out.println(c);
		 return g;
	}
	
	
	public static void main (String[]args)
	{
		
		
		 
		 Collection2<String ,Character> sc=new Collection2<String,Character>();
		// sc.g="Be Happy";
	//	 System.out.println(sc.g);
	    String  b=sc.demo('d');
	   // System.out.println(b);
	    
	 	
	
	}
	

}
