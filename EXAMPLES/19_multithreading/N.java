class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" ~~~ "+Thread.currentThread().getName());
		}
	}
}

class N{
	public static void main(String[] args){
		MyRunnable r = new MyRunnable();

		Thread t = new Thread(r,"Golu");
		t.start();
		
		try{
			t.sleep(300); //##########################
		}catch(InterruptedException e){
			e.printStackTrace();
		}

		for(int i=0;i<10;i++){
			System.out.println(i+" ~~~ "+Thread.currentThread().getName());
		}
	}
}