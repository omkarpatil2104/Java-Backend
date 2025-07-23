package Day16;

public class Threading extends Thread {
	
	public void t1(){
		
		try {
			Thread.sleep(2000);
		}catch(Exception e1) {
			e1.getStackTrace();
		}
		System.out.println("2 table print using Threading (Duration)");
		int num=2;
		for(int i=0;i<=10;i++) {
			int result = num*i;
			System.out.println( result);
		}
	}
	
	public void t2(int a,int b){
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.getStackTrace();
		}
		System.out.println("Addition printing using Thread Duration Concept");
		int result=a+b;
		System.out.println ("Addition will be:" + result);
		
		}
	
	
	
	public static void main(String [] args)
	{
		 Threading t=new  Threading();
		 t.t1();
		 t.t2(22,44);
		
	}
}
