class T{
	static void pro(Animal... x){
		for(Animal anm : x){
			System.out.println(anm);
		}
	}

	public static void main(String... e){
		Dog[] x = {new Dog(),new Dog()};		

		pro(x);
	}
}

class Animal{

}

class Dog extends Animal{

}