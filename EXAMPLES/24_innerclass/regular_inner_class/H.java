class X{
	int t = 120;

	void abc(){
		System.out.println("welcome");
	}

	class Y{

	}
}

class H{
	public static void main(String[] args){
		X x = new X();
		//System.out.println(t);
		//System.out.println(X.t);
		System.out.println(x.t);

		//abc();
		//X.abc();
		x.abc();

		//new Y();
		//X.new Y();
		x.new Y();
	}
}