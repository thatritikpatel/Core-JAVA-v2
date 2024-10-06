class MyRunnable implements Runnable{
	public void run(){
		Thread t = new Thread(new MyRunnable2(),"sohan");
		t.start();

		try{ t.join();}catch(InterruptedException e){e.printStackTrace();}
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}	
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}	
	}
}

class P{
	public static void main(String[] args) throws InterruptedException{
		Thread t = new Thread(new MyRunnable(),"mohan");
		
		t.start();

		t.join();

		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());
		}
	}
}