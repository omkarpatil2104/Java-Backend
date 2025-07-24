package day16_Homework;

public class Homework3 extends Thread{
	public void delay() {
		for(int i=1; i<=20; i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Homework3 h = new Homework3();
		h.delay();
	}
}
