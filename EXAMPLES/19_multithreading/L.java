class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" ~~~ "+Thread.currentThread().getName());
		}
	}
}

class L{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t1 = new Thread(r,"Golu");
		Thread t2 = new Thread(r,"Bholu");

		t1.start();
		t2.start();

		for(int i=0;i<10;i++){
			System.out.println(i+" ~~~ "+Thread.currentThread().getName());
		}
	}
}