package day10;

public class Overloading {
	
//	Overloading Example
	

	public static void one(int a,int b) {
		int	result = a+b;
		System.out.println("result will be:"+result);	
	}
	
	public void one(String name ) {
		
		System.out.println("Hello, World!");	
	}
	

	public void printingno(int n) {
	        System.out.println("Printing numbers from 1 to " + n + ":");
	        for (int i = 1; i <= n; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println(); 
	    }
	 
	 public void printingno(String txt) {
	        System.out.println("Character:");
	        for (int i = 0; i < txt.length(); i++) {
	            System.out.print(txt.charAt(i) + " ");
	        }
	        System.out.println();
	    }
	 
	 
	 public static void sub(int a,int b) {
		 int result =a-b;
		 System.out.println("Subtraction will be"+result);
	 }
	 
	 public static  void sub(double a,double b) {
		 double result=a/b;
		 System.out.print("Division will"+result);
	 }
	 
	 
	 
	public static void main(String [] args) {
		Overloading o=new Overloading();
		o.printingno(23);
		o.one("");
		one(620,23);
		o.printingno("Ashu,Soham ");
		sub(23,56);
         sub(25,56);

		
	}

}


