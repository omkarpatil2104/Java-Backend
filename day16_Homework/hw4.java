package day16_Homework;

public class Homework4 extends Thread{
	public void countdown() {
		for(int i = 10; i>=1; i--) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Tick Tick: "+i);
		}
	}
	
	public static void main(String[] args) {
		Homework4 h = new Homework4();
		h.countdown();
	}
}
