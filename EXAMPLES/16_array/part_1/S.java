class S{
	public static void main(String[] args){
		byte x = 12;
		short y = 23;
		char e = 78;
		
		long k = 23L;
		float a = 2.34f;
		double w = 2.34;

		//float[] arr = {x,y,e,k,a,w};
		float[] arr = {x,y,e,k,a,(float)w};

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);
	}
}