package testing;

public class S_methods {
	public static void main(String[]args)
	{
		
		String a="Good Morning have a   nice day   Morning ";
		String b="Morning";
		String g="Morning";
		System.out.println("hi");
		System.out.println(a);
		System.out.println(b);
		
		String c=a.toLowerCase();
		String d=a.toUpperCase();
		int  e=a.length();
		System.out.println("=========================");
		System.out.println(c);
		System.out.println(a);
		System.out.println(d);
		System.out.println(e);
		System.out.println("=========================");
		int f=b.length(); //total no of character in the string
		System.out.println(f);
		boolean h=g.equalsIgnoreCase(b);
		System.out.println(h);
		int i=g.compareToIgnoreCase(b); //dout 
		System.out.println(i);
		int j=a.indexOf("Morning");
		System.out.println(j);
		int k=a.lastIndexOf('o');
		System.out.println(k);
		System.out.println("=========================");
		int l=a.indexOf('o',3);
		System.out.println(l);
		int m=a.indexOf('o');
		System.out.println("=========================");
		System.out.println(m);
		char n=a.charAt(5);
		System.out.println(n);
		int o=a.indexOf("Morning",8);
		System.out.println(o);
		int p=a.indexOf("ddffghjhh");// when data is not present in the string
		System.out.println("The value of P is"+ p);
		boolean q=a.contains(b);
		System.out.println(q);
		boolean r=b.contains(a);
		System.out.println(r);
		System.out.println("*******************");
		boolean s=a.contains("have");
		System.out.println(s);
		String t=a.replace("Morning","Night"); //replace the word with new word
		System.out.println(t);
		String u=" hello ";
		String v=" Hi ";
		String w=u.concat(v);
		System.out.println(w);
		//int size=u.length();
		
	
		//String z=u.spl
		//System.out.println(z);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
