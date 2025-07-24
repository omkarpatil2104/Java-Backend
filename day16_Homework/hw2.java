package day16_Homework;

public class Homework2 {
	public void evenodd() {
	for(int i=1; i<=20; i++) {
		if(i%2==0) {
			System.out.println("This is EVEN no: "+i);
		}
		else {
			System.out.println("This is ODD no: "+i);
		}
	}
	}
	
	public static void main(String[] args) {
		Homework2 h = new Homework2();
		h.evenodd();
	}
}
