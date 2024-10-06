class K{
	static void pro(int x,int... y){
		System.out.println(x);
		for(int tmp : y){
			System.out.println(tmp+"~");
		}
	}

	public static void main(String... args){
		//pro(12,13,14);
		//pro();
		pro(17);
	}
}