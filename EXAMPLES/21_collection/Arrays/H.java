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

class NameRevSort implements Comparator<Employee>{
	public int compare(Employee e1,Employee e2){
		return e2.name.compareTo(e1.name);
	}
}

class H{
	public static void main(String[] args){
		Employee[] ar = {
							new Employee("mohan",34),
							new Employee("sohan",23),
							new Employee("rohan",28),
							new Employee("gohan",42),
							new Employee("dohan",38)
						};
		
		NameRevSort nrs = new NameRevSort();
		
		Arrays.sort(ar,nrs);
		Employee e = new Employee("jitendra",34);
		
		System.out.println(Arrays.binarySearch(ar,e,nrs));
		
	}
}






