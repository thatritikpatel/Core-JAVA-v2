import java.io.Console;

class Circle{
	private int r;

	synchronized void read(){
		if(r!=0){
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~r: "+r);
			r = 0;
			notify();
		}else{
			System.out.println(Thread.currentThread().getName()+" r==0");
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}

	synchronized void write(){
		if(r==0){
			System.out.println(Thread.currentThread().getName()+"Input a number: ");
			String str = System.console().readLine();
			r = Integer.parseInt(str);
			notifyAll();
		}else{
			System.out.println(Thread.currentThread().getName()+" r!=0");
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}
}

class MyRunnable1 implements Runnable{
	boolean flag = true;
	public void run(){
		while(true){
			M.a.write();	
		}	
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		while(true){
			String str = Thread.currentThread().getName();
			if(str.equals(M.str)){
				if(str.equals("Consumer1"))
					M.str = "Consumer2";
				else
					M.str = "Consumer1";
				M.a.read();
			}			
		}
	}
}

class M{
	static Circle a = new Circle();
	
	static String str = "Consumer1";

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"Producer").start();
		new Thread(r2,"Consumer1").start();
		new Thread(r2,"Consumer2").start();
	}
}