class Account{
	String acNum = "1234";
	String acType = "Sv";
	private int balance = 50;

	synchronized int getBalance(){
		return balance;
	}

	synchronized void withdraw(int amt){
		if(balance>=amt){
			try{ Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace();}
			balance = balance - amt;
		}else{
			System.out.println("insufficient balance...");
		}
	}
}

class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i+"-"+Thread.currentThread().getName()+" is going to withdraw and cur. bal.: "+C.account.getBalance());
			
			C.account.withdraw(10);
		}
	}
}

class C{
	static Account account = new Account();

	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(r,"mohan");
		Thread t2 = new Thread(r,"sohan");

		t1.start();
		t2.start();
	}
}