class X{
	void pro(){
		System.out.println("pro() in X");
	}
}

class Y extends X{
	void pro(){
		System.out.println("pro() in Y");
	}
}

class A{
	public static void main(String[] args){
		//Case 3:
		X a = new Y();
		a.pro();
		
		//Case 2:
		//Y y = new Y();
		//y.pro();

		//Case 1:
		//X x = new X();
		//x.pro();
	}
}