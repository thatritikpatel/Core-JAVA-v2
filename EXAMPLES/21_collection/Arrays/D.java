import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	int age;

	Employee(String name,int age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee e){
		return this.name.compareTo(e.name); 
	}

	public String toString(){
		return name+"-"+age;
	}
}

class D{
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
		System.out.println("#########################");
		for(Employee e : ar)
			System.out.println(e);
	}
}






