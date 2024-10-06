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

class B{
	public static void main(String[] args){
		//Case 3:
		X a = new Y();
		a.pro();
		
		//Case 2:
		//Y a = new Y();
		//a.pro();

		//Case 1:
		//X a = new X();
		//a.pro();
	}
}