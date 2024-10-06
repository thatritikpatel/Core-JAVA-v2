class City{
	String cityName;

	City(String cityName){
		this.cityName = cityName;
	}
}

class State{
	String stateName;

	State(String stateName){
		this.stateName = stateName;
	}
}

class Address{
	City city;
	State state;

	Address(City city,State state){
		this.city = city;
		this.state = state;
	}
}


class Student{
	String name;
	int age;
	Address address;

	public String toString(){
		return name+" - "+age+" - "+address.city.cityName+" - "+address.state.stateName;
	}

	Student(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
}

class J{
	public static void main(String[] args){
		Student[] x = new Student[2]; 		
		
		x[0] = new Student("mohan",12,new Address(new City("Jabalpur"),new State("MP")));
		x[1] = new Student("sudheer",23,new Address(new City("Bhopal"),new State("MP")));

		System.out.println(x[1]);
	}
}