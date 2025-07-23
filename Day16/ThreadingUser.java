package Day16;
import java.util.Scanner;
public class ThreadingUser extends Thread {
	


	    
	    int[] arr1;
	    int[] arr2;

	   
	    ThreadingUser(int a, int b) {
	        int result = a + b;
	        System.out.println("Sum in constructor: " + result);
	    }

	   
	    public void getUserInput() {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter number of elements for Thread 1: ");
	        int n1 = sc.nextInt();
	        arr1 = new int[n1];
	        System.out.println("Enter elements for Thread 1:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        
	        System.out.print("Enter number of elements for Thread 2: ");
	        int n2 = sc.nextInt();
	        arr2 = new int[n2];
	        System.out.println("Enter elements for Thread 2:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }


	    }

	    public void t1() {
	    	try {
	    		Thread.sleep(4000);
	    	}catch(Exception e2) {
	    		e2.printStackTrace();
	    	}
	        for (int a : arr1) {
	            System.out.println("Thread 1: " + a);
	        }
	    }

	    public void t2() {
	    
	        for (int a : arr2) {
	            try {
	                Thread.sleep(3000);
	                System.out.println("Thread 2: " + a);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }

	    // Main method
	    public static void main(String[] args) {
	    	ThreadingUser t = new ThreadingUser(244, 78);
	        t.getUserInput();  
	        t.t1();            
	        t.t2();            
	    }
	}


