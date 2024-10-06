//Singleton class

class X{
	static X a = new X();
	
	static X getInstance(){
		return a;
	}

	private X(){
		
	}
}

class Q{
	public static void main(String[] args){
		X x1 = X.getInstance();		
		X x2 = X.getInstance();
		X x3 = X.getInstance();

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
}

