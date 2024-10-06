class R{
	char u = 'A';
	R(){
		super();
		this.u = 'A';
	}
}

class Q extends R{
	float e = 5.67f;
	Q(){
		super();
		this.e = 5.67f;
	}
}

class K extends Q{
	int w;
	K(){
		super();
		this.w = 0;
	}
	public static void main(String[] args){
		K k = new K();
		System.out.println(k.u);
		System.out.println(k.e);
		System.out.println(k.w);
	}
}