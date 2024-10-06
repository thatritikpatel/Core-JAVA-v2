class X{
	X(int y){
		System.out.println(y);
	}
}

class M extends X{
	int pro(){
		return 12;
	}

	M(){
		super(pro());	
	}

	public static void main(String[] args){
		M a = new M();
	}
}