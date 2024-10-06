class X{
	X(){
		System.out.println("code in x()");
	}

	static {
		System.out.println("static block in X");
	}

	{
		System.out.println("init block in class X");
	}
}

class G extends X{
	static {
		System.out.println("static block in G");
	}
	
	G(){
		System.out.println("code in G()");
	}

	{
		System.out.println("init block in class G");
	}

	public static void main(String[] args){
		System.out.println("main start ~~~~~~");
		G x = new G();
		System.out.println("main end ~~~~~~");
	}
}