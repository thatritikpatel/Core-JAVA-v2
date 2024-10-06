class J{
	static void pro(int w){
		System.out.println("pro(int)");
	}

	static void pro(float w){
		System.out.println("pro(float)");
	}

	public static void main(String[] args){
		pro(12);
		//pro(2.34f);
	}
}