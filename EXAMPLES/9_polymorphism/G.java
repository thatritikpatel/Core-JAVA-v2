class G{
	public static void main(String[] args){
		Animal x = new Cow();
		x.makeSound();
		
		//Animal x = new Dog();
		//x.makeSound();
		
		//Animal x = new Cat();
		//x.makeSound();
	}
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