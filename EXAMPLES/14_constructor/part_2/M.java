class X{
	X(int y){
		System.out.println(y);
	}
}

class M extends X{
	static int e = 67;

	M(){
		super(e);	
	}

	public static void main(String[] args){
		M a = new M();
	}
}