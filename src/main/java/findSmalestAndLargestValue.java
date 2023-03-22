
public class findSmalestAndLargestValue {

	public static void main(String[] args) {
		
		int numbers[] = {22,23,45,67,100,0};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=1;i<numbers.length; i++) {
			
			if(numbers[i]>largest) {
				largest =numbers[i];
		}
		else if(numbers[i]<smallest) {
				smallest =numbers[i];
				
				
		}
			
	}
		System.out.println("Largest  " +largest);	
		System.out.println("Smallest " +smallest); 
}
	
}