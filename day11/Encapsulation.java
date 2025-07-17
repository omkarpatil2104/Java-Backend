package day11;

import java.util.Scanner;

public class Encapsulation {
	private String name;
	private int age;
	private String cityname;
	private float marks;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age>=18) {
			this.age = age;
			System.out.println("You are eligible for voting");
		}
		else {
			this.age = age;
			System.out.println("You are not eligible for voting");
		}
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String s = sc.next();
		
		System.out.println("Enter your age: ");
		int a = sc.nextInt();
		
		Encapsulation e = new Encapsulation();
		e.setName(s);
		System.out.println("Welcome "+e.getName()+" omkar");
		
		e.setAge(a);
		System.out.println(e.getAge());
	}
}