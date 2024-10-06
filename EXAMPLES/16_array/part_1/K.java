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

class K{
	public static void main(String[] args){
		Student[] x = new Student[2]; 		
		
		City c1 = new City("Jaipur");
		State s1 = new State("Rajasthan");

		Address a1 = new Address(c1,s1);
		
		x[0] = new Student("vikram",12,a1);
		

		City c2 = new City("Ahmedabad");
		State s2 = new State("Gujarat");

		Address a2 = new Address(c2,s2);
				
		x[1] = new Student("Karthik",23,a2);

		System.out.println(x[0]);
	}
}