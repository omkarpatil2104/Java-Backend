package day08_Homework;

import java.util.Scanner;

public class ClassR extends ClassS{
	public void store() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size:");
		
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.println("Enter product no: "+(i+1));
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Which product you want:");
		
		int prod = sc.nextInt();
		
		for(int i=0; i<size; i++) {
			if(arr[i]==prod) {
				System.out.println("Product is available");
			}
			else {
				System.out.println("Product is not available");
			}
		}
	}
}
