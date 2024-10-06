class F{
	public static void main(String[] args){
		Cat c = new Cat();
		callSound(c);

		Cow w = new Cow();
		callSound(w);

		Dog d = new Dog();
		callSound(d);
	}

	static void callSound(Animal c){
		c.makeSound();
	}
	
	/*
	static void callSound(Dog c){
		c.makeSound();
	}

	static void callSound(Cow c){
		c.makeSound();
	}

	static void callSound(Cat c){
		c.makeSound();
	}*/
}

class Animal{
	void makeSound(){
		System.out.println("Animal Sound");
	}
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat Sound");
	}
}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Cow Sound");
	}
}

class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog Sound");
	}
}