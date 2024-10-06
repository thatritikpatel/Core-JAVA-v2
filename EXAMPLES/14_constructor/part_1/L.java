class R{
	char u = 'A';
}

class Q extends R{
	float e = 5.67f;
}

class L extends Q{
	int w;
	public static void main(String[] args){
		L k = new L();
		System.out.println(k.u);
		System.out.println(k.e);
		System.out.println(k.w);
	}
}