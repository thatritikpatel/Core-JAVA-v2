class I{
	public static void main(String[] args){		
		abc(0);
	}

	static void abc(int a){
		System.out.println("-----1");

		try{
			System.out.println("-----2");
			int y = 12/a;	
			System.out.println("-----3");
		}catch(ArithmeticException e){
			//e.printStackTrace();
			throw new NullPointerException();
		}
		System.out.println("-----4");
	}
}