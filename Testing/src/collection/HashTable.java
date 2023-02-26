package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
	public static void main (String[]args)
	{
		Hashtable<Character,Float> table= new Hashtable<Character,Float> ();
		table.put('a', 34.5f);
		table.put('b', 38.5f);
		table.put('c', 38.5f);
		
		table.put('d', 10f);
	//	table.put('a', 10.5f);
	//	table.put('a', 34.5f);   // repeated key not allowed 
		//table.put('a', null); // In Hastable null value and null key not allowed
		
	//	table.put(null, 50f);
		//
		for(Map.Entry<Character,Float>  z: table.entrySet())
		{
			System.out.println("    Key = "   +  z.getKey()  +   "   Value  = "    +         z.getValue());
		}
		System.out.println("======================================");
		table.remove('d');
		
		for(Map.Entry<Character,Float>  z: table.entrySet())
		{
			System.out.println("    Key = "   +  z.getKey()  +   "   Value  = "    +         z.getValue());
		}
		
	}

}
