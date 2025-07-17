package day12;

public class Abstarction extends Animals {

	
	public static void main(String [] args) {
		
		Animals a= new  Abstarction();
		a.eat();
		
		Cow c=new Cow();
		c.eat();
		
		Tiger t=new Tiger();
		t.eat();
		
		Dog d=new Dog();
		d.eat();
		
		Monkey m=new Monkey();
		m.eat();
		
		goat g= new goat();
		g.eat();
	}

	
	public void eat() {
		
		
	}
}

abstract class Animals{
	abstract public void eat();

}

class Cow extends Animals{
	public void eat() {
		System.out.println("Eating veg");	
		}
}

class Tiger extends Animals{
	public  void eat() {
		System.out.println("Eating  Non-veg");
	}
}

class Dog extends Animals{
	public void eat(){
		
	System.out.println("eating meat");
		
	}

}

class Monkey extends Animals{
	public void eat(){
		
	System.out.println("Eating Apple");
		
	}

}


class goat extends Animals{
	public void eat(){
		
	System.out.println("eating grass");
		
	}

}





