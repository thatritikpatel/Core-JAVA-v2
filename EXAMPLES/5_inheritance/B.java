class X{
	void pro(){
		System.out.println("How are you");
	}
}

class B extends X{
	public static void main(String[] args){
		B x = new B();

		System.out.println(x.toString());
		//x.pro();
		//x.abc();
	}
}