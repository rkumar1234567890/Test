
public class swapingProg {

	public static void main(String[] args) {

		int a=10, b=20;
		
		System.out.println("Before Swaping "+a+ " " +b);
		//int t;
		//t=a;
		//a=b;
		//b=t;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Before Swaping "+a+ " " +b);
	}

}
