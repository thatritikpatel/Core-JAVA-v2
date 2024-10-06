class X{
	private X(){
		
	}
	
	//Case 3:
	static X createObject(){
		X a = new X();
		return a;
	}

	//Case 2:
	/*
	X createObject(){
		X a = new X();
		return a;
	}*/
}

class F{
	public static void main(String[] args){
		//Case 3:
		X z1 = X.createObject();
		X z2 = X.createObject();
		System.out.println(z1);
		System.out.println(z2);

		//Case 2:
		//X x = new X();	
		//X a = x.createObject();
		
		//Case 1:
		//X a = new X();
	}
}












