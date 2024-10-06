class X{
	class Y{

	}
}

class I{
	public static void main(String[] args){
		X x = new X();
		
		//Y y = x.new Y();
		X.Y y = x.new Y();
	}
}