package testing;

public class Palandrome {
	public static void main(String[]args)
	{
		String a="  ";
		String b="";
		//String c=null;
		boolean result=a.isEmpty();
		System.out.println(result);
		boolean res=b.isEmpty();
		
		System.out.println(res);
		System.out.println(a.length());
		String d="Good ";
		String e=" Morning";
		String f=d.concat(123 + "+"+e+ " Night");
		System.out.println(f);
		System.out.println("*************");
		String g=d.concat(e);
		System.out.println(g);
		String h="Velocity Class testing Class Pune Class Mumbai";
		        boolean i= h.startsWith("Velo");// string starts with the provided string or not
		        System.out.println(i);
		        boolean j= h.startsWith("velo");
		        System.out.println(j);
		        boolean k= h.startsWith("Velo ");// by using space
		        System.out.println(k);
		        System.out.println("=================");
		        boolean l=h.endsWith("mbai");
		        System.out.println(l);
		        
		        System.out.println("*******"+""+"Subset method"+"*********");
		        String m=h.substring(4); //only starting index
		        System.out.println(m);
		        String n=h.substring(4, 24); //starting from 4 to 23 in this 4 is included and 24 excluded
		        System.out.println(n);
		        System.out.println("========="+""+"replace  method"+"========");
		        String o=h.replace('e', 'E'); 
		        System.out.println(o);
		        String p=h.replace("Class", "Batch");
		        System.out.println(p);   //replace string
		        String q=h.replace("e", "ABCD");
		        System.out.println(q); 
		        System.out.println("========="+""+"trim  method"+"========");
		        String r="   Hello   ";
		        System.out.println(r);
		        String s=r.trim();
		        System.out.println(s);
		        String t="n    Velocity    n";
		        System.out.println(t);
		        
		        String u=t.trim();  // middle space of the string cannot change
		        System.out.println(u);
		        System.out.println("******"+""+"split  method"+"********");
		        String v [] =h.split("Class");
		        
		        for( int w=0;w<v.length; w++)
		        {
		        	 System.out.println(v[w]);
		        }
		        
		        System.out.println("**************");
		        
                     String x [] =h.split(" ");
		        
		        for( int w=0;w<x.length; w++)
		        {
		        	 System.out.println(x[w]);
		        }
		       
		//boolean resp=c.isEmpty();
		//System.out.println(resp);
		
		
	
	}

}
