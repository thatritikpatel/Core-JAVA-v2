class Car{ }

class SportsCar extends Car{ }

class ACar extends SportsCar{ }

class F{
	void pro(Car x){
		System.out.println("pro(Car)");
	}

	void pro(ACar x){
		System.out.println("pro(ACar)");
	}
	
	void pro(SportsCar x){
		System.out.println("pro(SportsCar)");
	}

	public static void main(String[] args){
		SportsCar c = new ACar();	
		
		F f = new F();
		f.pro(c);
	}
}