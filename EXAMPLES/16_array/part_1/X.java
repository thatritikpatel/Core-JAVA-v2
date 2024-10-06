class Animal{} 
class Dog extends Animal{}
class BDog extends Dog{ }
class Cat extends Animal{}

class X{
	public static void main(String[] args){
		Animal[] x = new Dog[3];
		
		x[0] = new Dog();
		x[1] = new BDog();

		x[2] = new Cat();
	}
}