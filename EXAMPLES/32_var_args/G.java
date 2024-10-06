class G{
	public static void main(String[] args){
		//abc(12);
		//abc();
		//abc(12,13,14);
		abc(new int[]{1,2,3,5,8,9});
	}

	static void abc(int... x){
		/*
		for(int tmp : x){
			System.out.println(tmp+"~");
		} */

		
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
}