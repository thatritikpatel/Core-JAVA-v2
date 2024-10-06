import java.util.ArrayList;

class Car{ }
class Bus{ }


class V{
	public static void main(String[] args){
		Rental<Car> r1 = new Rental<Car>();
		Car c1 = new Car();
		r1.addRecord(c1);
		//r1.addRecord(new Bus());
		Car car = r1.getRecord();

		Rental<Bus> r2 = new Rental<Bus>();
		Bus b1 = new Bus();
		r2.addRecord(b1);
		Bus bus = r2.getRecord();

	}
}

class Rental<T>{
	ArrayList<T> list = new ArrayList<T>();

	void addRecord(T t){
		list.add(t);
	}

	T getRecord(){
		return list.remove(0);	
	}
}