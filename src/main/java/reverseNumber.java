import org.apache.poi.util.SystemOutLogger;

public class reverseNumber {

	public static void main(String[] args) {
		
		int num =6789;
		
		int rev=0;
		
		while(num!=0) {
			int mm = num %10;
			System.out.print(mm);
			num = num / 10;
			
		}
				
		
		/*StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev1 =sb.reverse();
		
		System.out.println(rev1);*/
	}

}
