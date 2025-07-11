package Day08;

public class Class20 extends Class21 {
	public static void p4	() {
	    int i = 1;
	    while (i <= 5) {
	        int space = i;
	        while (space < 5) {
	            System.out.print(" ");
	            space++;
	        }

	        int num = 1;
	        while (num <= (2 * i - 1)) {
	            System.out.print(i);
	            num++;
	        }
	        System.out.println();
	        i++;
	    }
	}

}
