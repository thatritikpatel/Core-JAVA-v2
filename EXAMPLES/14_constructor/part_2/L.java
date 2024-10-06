class X{
	X(int y){
		System.out.println(y);
	}
}

class L extends X{
	int e = 67;

	L(){
		super(e);	
	}

	public static void main(String[] args){
		L a = new L();
	}
}