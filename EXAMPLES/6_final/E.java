final class X{
	void pro(){
		System.out.println("pro() in X");
	}
}

class E{
	X abc(X e){
		return null;
	}

	public static void main(String[] args){
		X x = new X();
		x.pro();
	}
}