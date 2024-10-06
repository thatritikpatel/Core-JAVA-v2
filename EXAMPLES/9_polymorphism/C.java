class LivingBeing{ }
class Animal extends LivingBeing{ }
class Human extends LivingBeing{ }
class Plant extends LivingBeing{ }

class Test{
	public static void main(String[] args){
		LivingBeing x = new Human();
		LivingBeing y = new Animal();
		LivingBeing z = new Plant();

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}






