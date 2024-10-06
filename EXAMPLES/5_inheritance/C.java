class C{
	public static void main(String[] args){
		SportsCar x = new SportsCar();
		
		//Case 1:			
		//System.out.println(x instanceof SportsCar);
		
		//Case 2:
		/*
		if(x instanceof SportsCar){
			System.out.println("SportsCar IS-A SportsCar");
		}*/
		
		/*
		if(x instanceof Car){
			System.out.println("SportsCar IS-A Car");
		}*/
		
		/*
		if(x instanceof FourWheeler){
			System.out.println("SportsCar IS-A FourWheeler");
		}*/
		
		/*
		if(x instanceof Vehicle){
			System.out.println("SportsCar IS-A Vehicle");
		}*/
		
		/*
		if(x instanceof Object){
			System.out.println("SportsCar IS-A Object");
		}*/
	}
}

class Vehicle{ }
class FourWheeler extends Vehicle{}
class Car extends FourWheeler{}
class SportsCar extends Car{ }