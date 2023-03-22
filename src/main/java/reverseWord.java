
public class reverseWord {

	
		

			public static void main(String[] args) {

		        String input= "The dog is chasing";

		        String[] arr= input.split(" ");
		        String reverse="";
		        for(int i=arr.length-1;i>=0;i--)
		        {
		            reverse+= ((reverse.equals(""))?"":" ")+arr[i];
		        }
		        System.out.println(reverse);

		    }

		}
	


