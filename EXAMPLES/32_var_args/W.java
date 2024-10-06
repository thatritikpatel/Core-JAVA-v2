class W{
	
	static void abc(float... x){
		System.out.println("float...");
	}	
	
	static void abc(Float... y){
		System.out.println("Float...");
	}

	public static void main(String... e){
		//abc(2.34f,4.56f);
		//abc(new Float(1.2),new Float(4.5));
	}
}