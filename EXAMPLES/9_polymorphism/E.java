class Test{
	public static void main(String[] args){
		//Case 4:
		Object x = new C();
		x.pro3();
		x.pro2();
		x.pro1();
		System.out.println(x.toString());
		
		//Case 3:		
		//A x = new C();
		//x.pro3();
		//x.pro2();
		//x.pro1();
		//System.out.println(x.toString());
		
		//Case 2:
		/*
		B x = new C();
		//x.pro3();
		x.pro2();
		x.pro1();
		System.out.println(x.toString());
		*/

		//Case 1:
		/*
		C x = new C();
		x.pro3();
		x.pro2();
		x.pro1();
		System.out.println(x.toString());
		*/
	}
}


class A{
	void pro1(){
		System.out.println("pro1 in A");
	}
}

class B extends A{
	void pro2(){
		System.out.println("pro2 in B");
	}
}

class C extends B{
	void pro3(){
		System.out.println("pro3 in C");
	}
}