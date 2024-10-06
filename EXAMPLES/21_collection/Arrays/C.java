import java.util.*;

class Employee{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}
}

class C{
	public static void main(String[] args){
		Employee[] ar = {
							new Employee("mohan",34),
							new Employee("sohan",23),
							new Employee("rohan",28),
							new Employee("gohan",42),
							new Employee("dohan",38)
						};


		for(Employee e : ar)
			System.out.println(e);

		Arrays.sort(ar);

		for(Employee e : ar)
			System.out.println(e);
	}
}






