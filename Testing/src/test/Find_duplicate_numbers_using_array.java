package test;

public class Find_duplicate_numbers_using_array {
	
	
	 public static void main(String[]args)
     {
   int count =0;
       int a[] ={1,2,2,4,5,7,8,9,9};
         int b=a.length;
         for(int c=0;c<b;c++)
        {
          for(int d=c+1;d<b;d++)
          {
           if(a[c]==a[d])
           {
            System.out.println( "The dulicate number is  "+  a[d]);
           count++;
           }
          }
         
        }
         System.out.println( count);
 }

}
