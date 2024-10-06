interface Z{ }

class X implements Z { }

class B{
	public static void main(String[] args){
		//Case 1:
		//Z z;
		
		//Case 2:
		//Z z = new Z();

		//Case 3:
		Z z = new X();
	} 
}