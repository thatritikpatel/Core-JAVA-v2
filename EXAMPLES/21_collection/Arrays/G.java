import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	Integer age;

	Employee(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Employee e){
		return e.age.compareTo(this.age); 
	}

	public String toString(){
		return name+"-"+age;
	}
}

class G{
	public static void main(String[] args){
		Employee[] ar = {
							new Employee("mohan",34),
							new Employee("sohan",23),
							new Employee("rohan",28),
							new Employee("gohan",42),
							new Employee("dohan",38)
						};


		
		Arrays.sort(ar);
		Employee e = new Employee("mohan",27);
		//Employee e = new Employee("mahesh",45);

		System.out.println(Arrays.binarySearch(ar,e));
	}
}






