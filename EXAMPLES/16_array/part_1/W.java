class Animal{} 
class Dog extends Animal{}
class BDog extends Dog{ }

class W{
	public static void main(String[] args){
		Animal[] x = new Dog[2];
		
		x[0] = new Dog();
		x[1] = new BDog();
	}
}