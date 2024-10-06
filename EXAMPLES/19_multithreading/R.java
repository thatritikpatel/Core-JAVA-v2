class MyRunnable implements Runnable{
	public void run(){
		try{R.y.join();}catch(InterruptedException e){e.printStackTrace();}
		System.out.println("Inside run()");
	}
}

class R{
	static Thread y;

	public static void main(String[] args) throws InterruptedException{
		y = Thread.currentThread();
		
		Thread t = new Thread(new MyRunnable(),"mohan");
		t.start();
		t.join();

		System.out.println("Inside main()");
	}
}