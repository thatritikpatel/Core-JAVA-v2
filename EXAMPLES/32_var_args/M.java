class M{
	M(float... x){
		System.out.println(x.length);
	}

	public static void main(String... a){
		new M();
		//new M(12.34f);
	}
}