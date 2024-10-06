class X{
	synchronized static void abc(){
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());	
		}		
	}

	synchronized void pqr(){
		for(int i=0;i<10;i++){
			System.out.println(i+"~"+Thread.currentThread().getName());	
		}
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		X.abc();	
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		H.x.pqr();		
	}
}

class H{
	static X x = new X();

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"bholu").start();
		new Thread(new MyRunnable2(),"dholu").start();
	}
}







