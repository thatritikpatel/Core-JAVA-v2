import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}
}

class AgeRevSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.age.compareTo(s1.age);
	}
}

class D{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Student("mohan",56));
		list.add(new Student("sohan",32));
		list.add(new Student("rohan",78));
		list.add(new Student("gohan",12));
		list.add(new Student("tohan",8));

		System.out.println(list);
		
		AgeRevSort ars = new AgeRevSort();
		Collections.sort(list,ars);

		System.out.println(list);
	}
}