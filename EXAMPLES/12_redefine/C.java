class X{
	int a = 34;
}

class Y extends X{
	int a = 44;
}

class C{
	public static void main(String[] args){
		//Case 3:
		X w = new Y();
		System.out.println(w.a);
		
		//Case 2:
		//Y w = new Y();
		//System.out.println(w.a);
		
		//Case 1:
		//X w = new X();
		//System.out.println(w.a);
	}
}