class P{
	static void abc(int... w){
		for(int tmp : w){
			System.out.println(tmp+" #");
		}
	}

	public static void main(String... x){
		byte b = 12;
		short s = 234;
		char c = 'a';
		int e = 56;
		long l = 90L;
		float f = 7.89f;
		double d = 2.34;

		abc(b,s,c,e,(int)l,(int)f,(int)d);
	}
}





