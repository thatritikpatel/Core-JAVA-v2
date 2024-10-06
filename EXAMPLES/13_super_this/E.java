interface A{
	int a = 12;
}

interface B{
	int a = 56;
}

class E implements A,B{
	//int a = 78;
	void pro(){
		System.out.println(a);
		System.out.println(A.a);
		System.out.println(B.a);
	}

	public static void main(String[] args){
		E e = new E();
		
		e.pro();
	}
}