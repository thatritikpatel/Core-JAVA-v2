class E{
	int t = 45;

	void abc(){
		System.out.println("Hi");
	}

	class Y{

	}

	public static void main(String[] args){
		E e = new E();

		System.out.println(e.t);

		e.abc();

		e.new Y();
	}
}