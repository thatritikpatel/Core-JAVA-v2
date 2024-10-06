class X{
	static{
		System.out.println("static init block in class X");
	}
}

class D extends X{
	public static void main(String[] args){
		System.out.println("Hello");
	}
}