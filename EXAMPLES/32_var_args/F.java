class F{
	public static void main(String[] args){
		//abc(12);
		//abc();
		//abc(12,13,14);
		abc(new int[]{1,2,3,5,8,9});
	}

	static void abc(int... x){
		//System.out.println(x);
		System.out.println(x.length);
	}
}