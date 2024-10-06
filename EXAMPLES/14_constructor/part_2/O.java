class X{
	X(int y){
		System.out.println(y);
	}
}

class O extends X{
	static int pro(){
		return 12;
	}

	O(){
		super(pro());	
	}

	public static void main(String[] args){
		O a = new O();
	}
}