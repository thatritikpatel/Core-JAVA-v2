import java.util.ArrayList;

class Car{ }
class Bus{ }

class CarRental{
	ArrayList<Car> cars = new ArrayList<Car>();

	void addCar(Car car){
		cars.add(car);
	}

	Car getCar(){
		return cars.remove(0);
	}
}

class BusRental{
	ArrayList<Bus> buses = new ArrayList<Bus>();

	void addBus(Bus bus){
		buses.add(bus);
	}

	Bus getBus(){
		return buses.remove(0);
	}
}

class U{
	public static void main(String[] args){
		CarRental cr = new CarRental();

		Car car = new Car();
		cr.addCar(car);

		Car c1 = cr.getCar();
	}
}