class Car{ }

class SportsCar extends Car{ }

class E{
	static void pro(Car x){
		System.out.println("pro(Car)");
	}
	
	static void pro(SportsCar x){
		System.out.println("pro(SportsCar)");
	}

	public static void main(String[] args){
		Car c = new SportsCar();	
		
		pro(c);
	}
}