import java.util.Arrays;

public class pp {

	public static void main(String[] args) {
		
		
		String ss []= {"Java","C","Java"};
		
		for(int i=0;i<ss.length;i++) {
			for(int j=i+1;j<ss.length;j++) {
				
				if(ss[i]==(ss[j])) {
					System.out.println(ss[i]);
				}
			}
		}
}
}