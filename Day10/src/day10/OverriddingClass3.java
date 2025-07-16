package day10;

public class OverriddingClass3 {
	
	public static void Star() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
//				System.out.println("A Simple Star Pattern");
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String [] args) {
		Star();
	}
}
