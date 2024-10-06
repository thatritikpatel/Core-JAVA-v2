//Singleton class

class X{
	static X a;
	
	static X getInstance(){
		if(a==null){
			a = new X();
		}

		return a;
	}

	private X(){
		
	}
}

class R{
	public static void main(String[] args){
		X x1 = X.getInstance();		
		X x2 = X.getInstance();
		X x3 = X.getInstance();

		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
	}
}

