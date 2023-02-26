package testing;

public class Reated_word_in_string {
	
	
	public static void main(String[] args) {
		
		String a=" hi Good Morning Good";
		String b[]=a.split(" ");
		//int x=1;
		int wrc =1;
		for(int c=0;c<b.length;c++)
		{
			for(int d=c+1;d<b.length;d++)
			{
			if(b[c].equals(b[d]))
			{
			wrc=wrc+1;
			b[d]="0";
			
			}
			
		}
		if(b[c]!="0") 
		
		System.out.println(b[c]+" "+ wrc);
	//	wrc=1;
		
	}
	} 

}
