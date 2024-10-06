class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}
	} 
}

class S{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(r,"Dholu");
		//t1.setPriority(1);
		t1.setPriority(Thread.MIN_PRIORITY);

		Thread t2 = new Thread(r,"Bholu");
		//t2.setPriority(10);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();

		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}
	}
}