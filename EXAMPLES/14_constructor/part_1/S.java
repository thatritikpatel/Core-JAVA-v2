class E{
	E(){
		System.out.println("E()");
	}

	E(float w){
		this();
		System.out.println("E(float)");
	}
}


class S extends E{
	S(){
		this(13);
		System.out.println("S()");
	}

	S(int y){
		super(2.34f);
		System.out.println("S(int)");
	}

	public static void main(String[] args){
		S e = new S(12);
		System.out.println("main()");
	}
}