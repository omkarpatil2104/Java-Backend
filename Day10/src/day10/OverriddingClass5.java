package day10;

public class OverriddingClass5 {

	 public void printingno(int n) {
	        System.out.println("Character:");
	        for (int i = 0; i <=n; i++) {
	            System.out.println(i);
	        }
	        System.out.println();
	    }
	 
	public static void main(String [] args) {
		
		OverriddingClass5 o=new OverriddingClass5();
		o.printingno(100);
	}
}
