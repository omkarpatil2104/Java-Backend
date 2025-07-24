package day17;

import java.util.ArrayList;
import java.util.Stack;

public class CollectionFramework {

	public static void main(String [] args) {
		ArrayList<String> arr=new ArrayList<>();
		
		arr.add("Omkar");
		arr.add("Junaid");
		arr.add("Divyesh");
		arr.add("Swaraj");
		arr.add("Aditya");
		arr.add("Shreepad");
		arr.add("Atharva");
		
		System.out.println(arr);
		
		arr.remove(1);
		System.out.println(arr);
		
		arr.set(3,"Swaraj");
		System.out.println(arr);
		
		arr.clear();
		System.out.println(arr);
		
		
		Stack<String> s=new Stack<>();
		s.push("Om Khole");
		s.push("omkar Patil");
		s.push("Swaraj Mate");
		s.push("Aditya Chorage");
		s.push("Atharva Kapse");
		s.push("Aditya Patarwat");
		s.push("Shreepad Suryawanshi");
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
   }
	
}
