package day16_Homework;

public class Homework5{
	
	public static void main(String[] args) {
		
		Rabbit r = new Rabbit();
		r.rabbit();
		
		Turtle t = new Turtle();
		t.turtle();
	}
	
}


class Rabbit extends Thread{
	public void rabbit() {
		for(int i=1;i<=26;i++) {
			try {
				Thread.sleep(1000); 
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Rabbit prints: "+i);
		}
	}
}

class Turtle extends Thread{
	public void turtle() {
		for(char i='A';i<='Z';i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("Turtle prints: "+i);
		}
	}
}
