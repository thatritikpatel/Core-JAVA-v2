class A{ }

class B extends A{ }

class E extends B{ }

class C extends B{  }

class D extends C{ }

class Test{
	public static void main(String[] args){
		//Case 1:
		//D x = new D();
		
		//Case 2:
		//C x = new D();
		
		//Case 3:	
		//B x = new D();
		
		//Case 4:
		//A x = new D();
		
		//Case 5:
		//Object x = new D();

		//Case 6:
		E x = new D();
	}
}