package test;
 public class Practice
{
	 public static void main(String[]args)
	 {
	 
		 
		 int a[] = {45,12,63,74};
	
		
		 
		 for(int c=0;c<a.length-1;c++)
			 if(a[c]>a[c+1])
		 {
			int d=a[c];
			a[c]=a[c+1];
			a[c+1]=d;
		 }
		 
		 for(int f=0;f<a.length;f++)
		 System.out.print(a[f]+",");
		 
		 System.out.println();
		 System.out.println("Descending order ");
		 for(int f=a.length-1;f>=0;f--)
			 System.out.print(a[f]+",");
		 
	 }

 }