class MyThread extends Thread{
	public void run(){

	}
}


class I{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		t1.setPriority(7);
		//t1.setPriority(11);
	}
}