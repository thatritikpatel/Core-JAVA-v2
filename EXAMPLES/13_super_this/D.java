class X{
	static int a = 34;
}

class Y extends X{
	static int a = 44;

	void pro(){
		int a = 90;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

class D{
	public static void main(String[] args){
		Y q = new Y();
		q.pro();
	}
}