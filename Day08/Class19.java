package Day08;

public class Class19 extends Class20 {

	public static void p3() {
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
