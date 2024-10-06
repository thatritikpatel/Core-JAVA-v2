class A{
	int a;
}

class B extends A{
	int b;
}

class C extends B{
	int c;
}

class Y{
	public static void main(String[] args){
		C x = new C();

		System.out.println(x.a);
		System.out.println(x.b);
		System.out.println(x.c);
	}
}