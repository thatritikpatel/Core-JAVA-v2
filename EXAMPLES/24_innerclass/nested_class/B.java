class B{
	static int e = 90;

	static void abc(){
		System.out.println("Hello");
	}
	
	static class C{

	}

	public static void main(String[] args){
		System.out.println(e);

		abc();

		C c = new C();
	}
}