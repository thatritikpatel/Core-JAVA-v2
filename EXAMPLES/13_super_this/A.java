class X{
	void pro(){
		System.out.println("pro in X");
	}
}

class Y extends X{
	void pro(){
		System.out.println("pro in Y");	
	}

	void abc(){
		pro();
		super.pro();
	}
}

class A{
	public static void main(String[] args){
		Y a = new Y();

		a.abc();
	}
}