class Account{
	String acNum = "1234";
	String acType = "Sv";
	int balance = 50;

	int getBalance(){
		return balance;
	}

	void withdraw(int amt){
		balance = balance - amt;
	}
}

class MyRunnable implements Runnable{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(i+"-"+Thread.currentThread().getName()+" is going to withdraw and cur. bal.: "+A.account.getBalance());
			
			try{ Thread.sleep(100);}catch(InterruptedException e){ e.printStackTrace();}

			A.account.withdraw(10);
		}
	}
}

class A{
	static Account account = new Account();

	public static void main(String[] args){
		MyRunnable r = new MyRunnable();
		
		Thread t1 = new Thread(r,"mohan");
		Thread t2 = new Thread(r,"sohan");

		t1.start();
		t2.start();
	}
}