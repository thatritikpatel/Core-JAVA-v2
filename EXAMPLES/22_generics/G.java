import java.util.*;

class Animal{ }
class Cat extends Animal{}
class Cow extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}

class G{
	public static void main(String[] args){		
		ArrayList<Animal> a = new ArrayList<Animal>();
		
		a.add(new Animal());
		a.add(new Dog());
		a.add(new Cat());
		a.add(new Cow());
		a.add(new BDog());

		System.out.println(a);
	}
}