package Day08;

public class Class13 extends Class14 {
	public static void pattern3() {
	    for (int i = 1; i <= 5; i++) {
	        for (int j = i; j < 5; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= (2 * i - 1); k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}


}
