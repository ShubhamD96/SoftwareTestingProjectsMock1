package collection;

import java.util.ArrayList;
import java.util.HashSet;

public class GenericInCollection {
	public static void main(String[]args)
	{
		// Data Insertion
		//Heterogeneous collection
		ArrayList a= new ArrayList();
		a.add(55);
		System.out.println(a);
		a.add(55.60f);
		a.add('g');
		a.add("Hello");
		for(int b=0;b<a.size();b++)
		{
			// Data retrival
			System.out.println(a.get(b));
		}
		
		System.out.println("Size"+  a.size());
		System.out.println("*****************");
		//data remove
		a.remove(2); // g remove
		for(int b=0;b<a.size();b++)
		{
			System.out.println(a.get(b));
		}
		System.out.println("Size"+  a.size());
		
		System.out.println("##################");
		// Homogeneous data 
		ArrayList<String> s= new ArrayList<String> ();
		s.add("hi");
		s.add("hi");
		s.add("Hello");
		s.add("good");
		s.add("Excellent");
		s.add("Nice");
		
		for(int c=0;c<s.size();c++)
		{
			System.out.println(s.get(c));
		}
		
		System.out.println("=======================");
		HashSet<String> h= new HashSet<String> ();
		h.add("hi");
		h.add("hi");// dupicate data not allowed
		h.add("Hello");
		h.add("good");
		h.add("Excellent");
		h.add("Nice");
		
		for( String x:h)
		{
			System.out.println(x);
		}
		
	}
	

}
