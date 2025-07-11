package Day08;

public class Class15 extends Class16 {

	
	public static void pattern5() {
	    for (int i = 1; i <= 5; i++) {
	        for (int j = i; j < 5; j++) {
	            System.out.print(" ");
	        }
	        for (int k = 1; k <= i; k++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}

}
