class MyThread extends Thread{
	public void run(){
		for(int i=1;i<=20;i++){
			System.out.println("~~~~~~~"+i);
		}
	}
}

class D{
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();

		for(int i=1;i<=20;i++){
			System.out.println("########"+i);
		}
	}
}
