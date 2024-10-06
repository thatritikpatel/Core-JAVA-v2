class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }
class BDog extends Dog{ }

class U{
	public static void main(String[] args){
		Cat a1 = new Cat();
		Dog a2 = new Dog();
		Cow a3 = new Cow();
		BDog a4 = new BDog();
		Animal a5 = new Animal();

		Animal[] x = {a1,a2,a3,a4,a5};


	}
}