import java.util.*;

class R{
	public static void main(String[] args){
		ArrayList<? super Dog> y1 = new ArrayList<Dog>();
		ArrayList<? super Dog> y2 = new ArrayList<Animal>();
		ArrayList<? super Dog> y3 = new ArrayList<LivingBeing>();
		ArrayList<? super Dog> y4 = new ArrayList<Object>();

		//y4.add(new Object());		
		//y3.add(new LivingBeing());		
		//y2.add(new Animal());		
		
		
		//y1.add(new Dog());
		//y1.add(new BDog());

		//y2.add(new Dog());
		//y2.add(new BDog());

		//y3.add(new Dog());
		//y3.add(new BDog());

		y4.add(new Dog());
		y4.add(new BDog());
	}
}

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Cow extends Animal{ }
class BDog extends Dog{ }