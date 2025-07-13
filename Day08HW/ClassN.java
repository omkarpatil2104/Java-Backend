package day08_Homework;

public class ClassN extends ClassO{
	public void evenodd() {
		for(int i=0; i<=100; i++) {
			if(i%2==0) {
				System.out.println("This is EVEN no: "+i);
			}
			else {
				System.out.println("This is ODD no: "+i);
			}
		}
	}
}
