import java.io.Console;

class Circle{
	int r;

	synchronized void read(){
		if(r!=0){
			System.out.println(Thread.currentThread().getName()+"~~~~~~~~r: "+r);
			r = 0;
			notify();
		}else{
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}

	synchronized void write(){
		if(r==0){
			System.out.println(Thread.currentThread().getName()+"Input a number: ");
			String str = System.console().readLine();
			r = Integer.parseInt(str);
			notify();
		}else{
			try{wait();}catch(InterruptedException e){e.printStackTrace();}
		}
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		while(true){
			L.a.write();	
		}	
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		while(true){
			L.a.read();
		}
	}
}

class L{
	static Circle a = new Circle();

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"Producer").start();
		new Thread(new MyRunnable2(),"Consumer").start();
	}
}