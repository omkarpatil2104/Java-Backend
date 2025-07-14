package Interfaces;
public class InterfaceDemo implements K,B,C,D,E,F,G,H,J,L{
	public static void main(String []args) {
		
		InterfaceDemo i=new InterfaceDemo();
		i.evenOdd();
		i.add(3, 5);
		i.sub(3, 4);
		i.star();	
		i.simple();
		i.pattern5();
		i.For();
		i.array();
		i.pattern3();
		i.p4();
		
		
	}

     public void evenOdd() {
			for(int i=0;i<=50;i++) {
				if(i%2==0) {
					System.out.println(i+"Even Number");
					}
				else {
					System.out.println(i+"Odd number");
				}
			}
		}
	


public void add(int a, int b) {
	int result = a + b;
	System.out.println("Addition will be:" + result);
 }



public void sub(int a, int b) {
	int result = a-b;
	System.out.println("Addition will be:" + result);
	
}

public  void star() {
	for(int i=0;i<5;i++) {
		System.out.println();
		for(int j=0;j<=5;j++) {
			System.out.print("*");
		
		}
	}
 }
 
public void simple() {
	System.out.println("Hello World");
   }

public  void pattern5() {
    for (int i = 1; i <= 5; i++) {
        for (int j = i; j < 5; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
  }

public  void For() {
	for(int i=0;i<=10;i++) {
		System.out.print(i);
	}
  }

public void array() {
	String arr1[]= new String[8];
	arr1[0]="Chetan sir";
	arr1[1]="Omkar";
	arr1[2]="Junaid";
	arr1[3]="harshal";
	arr1[4]="Nikhil";
	arr1[5]="Prathmesh";
	arr1[6]="Sohan";
	arr1[7]="Soham";
			
	for(int i=0;i<8;i++) {
		System.out.println(arr1[i]+"");			
	}	 
  }

public void pattern3() {
    for (int i = 1; i <= 5; i++) {
        for (int j = i; j < 5; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
  }

public  void p4	() {
    int i = 1;
    while (i <= 5) {
        int space = i;
        while (space < 5) {
            System.out.print(" ");
            space++;
        }

        int num = 1;
        while (num <= (2 * i - 1)) {
            System.out.print(i);
            num++;
        }
        System.out.println();
        i++;
    }
}

}


	
interface K{
	void evenOdd();
}

interface B{
	void add(int a1, int b1);
	
}

interface C{
	void sub(int a, int b);
}

interface D{
	void star();
}

interface E{
	void simple();
}

interface F{
	void pattern5();
}


interface G{
	void For();
}

interface H
{
	void array();
}

interface J{
	void pattern3();
	
}

interface L{
	void p4();
}
