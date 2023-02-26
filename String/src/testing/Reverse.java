package testing;

public class Reverse {
	
		public static void main(String []args) 
		{
			String a="Hello hi";
			String c="";
			
		      System.out.println(a);
			String[] d=a.split(" ");  //before space how many word 
			for(int x=0;x<d.length;x++)
			{
				String e=d[x];
				String f="";
			for(int h=e.length()-1;h>=0;h--)  //reverse character 
			{
				f=f+e.charAt(h);	
			}
			c=c+f+" ";        // store all character 
			}
			a=c;
			System.out.println(a);
		}
		


}
