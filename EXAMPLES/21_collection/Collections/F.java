import java.util.ArrayList;
import java.util.Collections;


class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class F{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Student("mohan",56));
		list.add(new Student("sohan",32));
		list.add(new Student("rohan",78));
		list.add(new Student("gohan",12));
		list.add(new Student("tohan",8));

		
		
		Collections.sort(list);
		
		//Student s = new Student("rohan",32);
		Student s = new Student("ritesh",32);
		System.out.println(Collections.binarySearch(list,s));
	}
}