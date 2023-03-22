import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readTxtFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\tahir\\eclipse-workspace\\032021-NextethITC\\TestFile\\Test.txt");
		
			Scanner sc=new Scanner(file);
			
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			
			//sc.useDelimiter("//Z");
			
			//System.out.println(sc.next());
		
			
			
	}

}
