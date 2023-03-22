
public class removeAllWhiteSpeces {

	public static void main(String[] args) {
		
		String newstr =  "     Geeks     for   Geeks     ";
		
		//System.out.println(newstr.trim());
		System.out.println(newstr.replaceAll("\\s+", ""));

	}

}
