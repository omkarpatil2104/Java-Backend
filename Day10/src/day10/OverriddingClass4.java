package day10;
public class OverriddingClass4 {
	
 public static void Printingno(int n) {
	  
	        System.out.println("Printing numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            System.out.println(i + " ");
	        }
	        
	        System.out.println(); 
	    }
	public static void main(String [] args) { 
		OverriddingClass4 o=new OverriddingClass4();
		o.Printingno(1000);
	}
 }

