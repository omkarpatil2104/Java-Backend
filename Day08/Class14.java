package Day08;

public class Class14 extends Class15{
	public static void pattern4() {
	    for (int i = 5; i >= 1; i--) {
	        for (int j = 5; j > i; j--) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= (2 * i - 1); k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}


}
