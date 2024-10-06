class Animal{ }
class Dog extends Animal{ }
class Cat extends Animal{ }
class Cow extends Animal{ }

class R{
	public static void main(String[] args){
		Animal[][] x = {{new Cat(),new Cow()},{new Dog(),new Animal()}};

		for(Animal[] y : x){
			for(Animal z: y){
				System.out.print(z+" ");
			}
			System.out.println();
		}
	}
}