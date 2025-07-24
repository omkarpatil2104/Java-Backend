package day16_Homework;

public class Homework1 extends Thread {
	public void run() {
		for(int i = 1; i<=10; i++) {
			System.out.println("This number is printed using run() ---> "+i);		}
	}
	
	public static void main(String[] args) {
		Homework1 h = new Homework1();
		h.start();
	}
}
