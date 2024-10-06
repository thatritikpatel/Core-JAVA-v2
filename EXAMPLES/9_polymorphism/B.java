class LivingBeing{ }
class Animal extends LivingBeing{ }
class Human extends LivingBeing{ }
class Dog extends Animal{ }
class BDog extends Dog{ }

class Test{
	public static void main(String[] args){
		//Case 5:
		//Human x = new BDog();
		
		//Case 4:
		//Object x = new BDog();
		//System.out.println(x);
		
		//Case 3:
		//Animal x = new BDog();
		//System.out.println(x);
		
		//Case 2:
		//Dog x = new BDog();
		//System.out.println(x);

		//Case 1:
		//BDog x = new BDog();
		//System.out.println(x);
	}
}






