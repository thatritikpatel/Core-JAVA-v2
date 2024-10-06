//Case 2:
class I{
	I(){
		System.out.println("Hello ~~~");
	}

	public static void main(String[] args){
		I a = new I();
		//System.out.println("Hello");

		I b = new I();
		//System.out.println("Hello");

		I c = new I();
		//System.out.println("Hello");
	}
}


//Case 1:
/*
class I{
	public static void main(String[] args){
		I a = new I();
		System.out.println("Hello");

		I b = new I();
		System.out.println("Hello");

		I c = new I();
		System.out.println("Hello");
	}
}*/