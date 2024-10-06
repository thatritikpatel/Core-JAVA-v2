class X{
	
	static void abc(float... x){
		System.out.println("float...");		
	}	
	
	static void abc(float[] y){
		System.out.println("Float...");
	}

	public static void main(String... e){
		abc(2.34f,4.56f);
	}
}