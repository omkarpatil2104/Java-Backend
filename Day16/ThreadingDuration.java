package Day16;

public class ThreadingDuration extends Thread {
	 

		public void t1() {
	     int arr1[]= {88,44,5667,8,9,9,3,3,4,222,44,55,66,77,};
	     for(int a : arr1) {
	    	 System.out.println("Tread 1 "+a);
	     }
		}

		public void t2() {
			try {
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			   int arr1[]= {222,44,323,55,7899,33,33344556,};
			     for(int a : arr1){
			    	 try {
						Thread.sleep(1000);
					 } catch (InterruptedException e) {
						
						e.printStackTrace();
					 }
			    	 System.out.println("Tread 2 "+a);
			     }
		}
		
		ThreadingDuration(int a , int b){
			int result =a+b;
			System.out.println(result);
		}
		
		public static void main(String[] args) {
			ThreadingDuration t = new ThreadingDuration(244,78);
//			t.t1();
			t.t2();
		}
	}


