class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" ~~~~ run()");
	}
}

class E{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.setName("Mohan");
		t.start();
		//t.run();

		System.out.println(Thread.currentThread().getName()+" ~~~~~ main()");
	}
}