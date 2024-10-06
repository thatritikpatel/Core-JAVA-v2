interface A{ }
interface B extends A{ }
interface C extends A{ }

class D implements B{ }
class E extends D implements C{ }
class F extends E implements B{ }

class J{
	public static void main(String[] args){
		F f = new F();
		System.out.println(f instanceof A);
		System.out.println(f instanceof B);
		System.out.println(f instanceof C);
		System.out.println(f instanceof D);
		System.out.println(f instanceof E);
		System.out.println(f instanceof F);
	}
}