package day14;

import java.util.Scanner;

public class Throwcatch extends Exception {
		
	public Throwcatch(String msg) {
		super(msg);
	}
	public static void main(String [] args) throws Throwcatch {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter your marks ");
		 int marks=sc.nextInt();
		 try {
			 if(marks<0||marks>100) {
		           throw new Throwcatch("marks should be 0 to 100 between");
		         
			 }

		 }
			 catch(Exception e){
				 e.getMessage();
				 e.printStackTrace();
				 System.out.print(e.getMessage());
	   }		 	
	}
}
	 
class os{
	public static void checkmarks(int marks) throws Throwcatch {
		if(marks<0||marks>100) {
           throw new Throwcatch("marks should be 0 to 100 between");
           
		}else {
			System.out.print("Marks are less than 100");		
		}
	  }
	}
 

