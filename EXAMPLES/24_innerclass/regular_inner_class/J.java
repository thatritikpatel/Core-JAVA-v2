class X{
	int y = 91;
	static float z = 7.8f;
}

class J{
	public static void main(String[] args){
		//Case 1:
		//System.out.println(y);
		//System.out.println(z);

		//Case 2:
		System.out.println(new X().y);
		System.out.println(X.z);
	}
}