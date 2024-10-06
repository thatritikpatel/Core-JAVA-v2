class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }

class M{
	public static void main(String[] args){
		Cat c = new Cat();
		Dog d = new Dog();
		Cow w = new Cow();

		pro(c);
		pro(d);
		pro(w);
	}

	static void pro(Animal a){
		System.out.println("~~~~~");
	}
}