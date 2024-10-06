class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}	
}

class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
			if(i>11&&i<17){
				System.out.println(i+" Raju is going to yield");
				Thread.yield();
			}			
		}
	}
}

class O{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		MyRunnable2 y = new MyRunnable2();

		Thread t1 = new Thread(r,"Bheem");
		Thread t2 = new Thread(r,"Chutki");
		Thread t3 = new Thread(y,"raju");

		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<20;i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
		}
	}
}