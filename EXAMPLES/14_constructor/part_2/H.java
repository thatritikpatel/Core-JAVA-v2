class X{
	private X(){
		
	}

	X(int y){
		this();
	}
}

class H{
	public static void main(String[] args){
		X a = new X(12);
	}
}