package collection;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	public static void main (String[]args)
	{
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		
	//	Insertion  data by using put method
		
		map.put(10, "Two");   
		map.put(25, "Hello");
		map.put(65, "Table");
	    map.put(10, "Ten");
		map.put(10, "Ten");
	    	map.put(15,null );
		map.put(null, "One");  // multiple null value accept
		//map.put(null, "Good");  only one null key accept
	    	map.put(30,null );
	    	
	    	
	    	
	    	
	    	// data retrieval 
           for(Map.Entry<Integer, String> s : map.entrySet())
	            	{
			          System.out.println("    Key  =   "+s.getKey() +"   Value  = "+ s.getValue());
	            	}
           System.out.println("====================================");
           // data delete
           
               map.remove(10);
      
      
           for(Map.Entry<Integer, String> s : map.entrySet())
	        	{
		            	System.out.println("    Key  =   "+s.getKey() +"   Value  = "+ s.getValue());
		       }
           System.out.println("*****************************************");
           map.replace(25, "Hi");
           
           for(Map.Entry<Integer, String> s : map.entrySet())
       	{
	            	System.out.println("    Key  =   "+s.getKey() +"   Value  = "+ s.getValue());
	      }
		
           System.out.println("====================================");
           map.replace(65, " Table", null);
           
           for(Map.Entry<Integer, String> s : map.entrySet())
          	{
                   	System.out.println("    Key  =   "+s.getKey() +"   Value  = "+ s.getValue());
             }
	}
	
    

}
