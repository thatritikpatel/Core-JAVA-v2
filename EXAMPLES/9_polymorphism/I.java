interface A{ }
interface B extends A{ }
interface C extends A{ }

class D implements B{ }
class E extends D implements C{ }
class F extends E implements B{ }

class I{
	public static void main(String[] args){
		A a = new F();
		B b = new F();
		C c = new F();
		D d = new F();
		E e = new F();
	}
}