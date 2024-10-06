class A{ 
	synchronized void abc(){
		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
		I.b.xyz();
	}

	synchronized void pqr(){
	
	}
}

class B{ 
	synchronized void mno(){
		try{Thread.sleep(50);}catch(InterruptedException e){e.printStackTrace();}
		I.a.pqr();
	}

	synchronized void xyz(){
		
	}
}

class MyRunnable1 implements Runnable{
	public void run(){
		I.a.abc();
	}
}

class MyRunnable2 implements Runnable{
	public void run(){
		I.b.mno();
	}
}

class I{
	static A a = new A();
	static B b = new B();

	public static void main(String[] args){
		new Thread(new MyRunnable1(),"mohan").start();
		new Thread(new MyRunnable2(),"sohan").start();

	}
}