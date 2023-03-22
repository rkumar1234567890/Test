
public class duplicateChar {

	public static void main(String[] args) {
		
		String str="poonam";
		 int length = str.length();
		 int count=0;
		 char[] ch=str.toCharArray();
		 
		 	for(int i=0;i<length;i++)
		 	{
		 		for(int j=i+1;j<length;j++)
		 		{	
		 			if(ch[i]==ch[j])
		 				
		 				System.out.println("Duplicate Character" +ch[j]);
				 		count++;
				 		
		 		}	 				
		 				
		 	}
		 	
		 	System.out.println(count);
		 			
		 }
		 		
				 	
		 		
	}





