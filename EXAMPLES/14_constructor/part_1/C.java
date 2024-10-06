class C{
	C(int y){
		System.out.println("Inside constructor");
	}

	public static void main(String[] args){
		//Case 2:
		C x = new C(12);
		
		//Case 1:
		//C x = new C();
	}
}