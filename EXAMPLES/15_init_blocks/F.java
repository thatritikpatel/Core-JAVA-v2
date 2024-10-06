class X{
	X(){
		System.out.println("code in x()");
	}

	{
		System.out.println("init block in class X");
	}
}

class F extends X{
	F(){
		System.out.println("code in F()");
	}

	{
		System.out.println("init block in class F");
	}
	public static void main(String[] args){
		System.out.println("main start ~~~~~~");
		F x = new F();
		System.out.println("main end ~~~~~~");
	}
}