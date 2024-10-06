class LivingBeing{ }

class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }
class BDog extends Dog{ }

class CDog extends BDog{}

class V{
	public static void main(String[] args){
		Cat a1 = new Cat();
		Dog a2 = new Dog();
		Cow a3 = new Cow();
		BDog a4 = new BDog();
		Animal a5 = new Animal();

		LivingBeing a6 = new BDog();

		Animal[] x = {a1,a2,a3,a4,a5,(BDog)a6};

		//Animal t = (Animal)a6;

		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
	}
}