package envision;
import envision.Add; 
import envision.Subtraction;
import envision.Ifelse;
import envision.Array;
import envision.Starpattern;
import envision.Elseif;
public class Class {

	public static void main(String [] args) {
		
		Add op=new Add();
		op.add(2, 3);
		
	     Subtraction gi=new Subtraction();
	     gi.sub(2,6);
	     
	     Ifelse i=new Ifelse();
	     i.less(23, 56);
	     
	     Array a=new Array();
	     a.array();
	     
	     Starpattern s=new Starpattern();
	   s.star(); 
	   
	   Elseif e=new Elseif();
	   e.ifelse(20);
	   
	     
//	     By default
	     Mac nc= new Mac();
	     nc.book();
		
//	     By default
	     Envision cm= new Envision();
	     cm.management();
	}
}

// By default

class Mac{
	public void book() {
		System.out.println("Welcome to macbook center");
	}
}

class Envision{
	public void management() {
		System.out.println("Welcome to Envision Chetan Sir's batch");
	}
}
