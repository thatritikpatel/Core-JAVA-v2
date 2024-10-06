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
		return this.age.compareTo(s.age);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class C{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Student("mohan",56));
		list.add(new Student("sohan",32));
		list.add(new Student("rohan",78));
		list.add(new Student("gohan",12));
		list.add(new Student("tohan",8));

		System.out.println(list);
		
		Collections.sort(list);

		System.out.println(list);
	}
}