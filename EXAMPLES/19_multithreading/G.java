class MyThread extends Thread{
	public void run(){

	}
}

class YourThread extends Thread{
	public void run(){

	}
}

class G{
	public static void main(String[] args){
		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();

		System.out.println(t1.getName());
		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t1.isAlive());

		System.out.println("#######################");
		
		System.out.println(t2.getName());
		System.out.println(t2.getId());
		System.out.println(t2.getPriority());
		System.out.println(t2.isAlive());
	}
}