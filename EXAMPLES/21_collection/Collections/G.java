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

class AgeSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.age.compareTo(s2.age);
	}
}

class NameRevSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.name.compareTo(s1.name);
	}
}

class NameSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class G{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(new Student("mohan",56));
		list.add(new Student("sohan",32));
		list.add(new Student("rohan",78));
		list.add(new Student("gohan",12));
		list.add(new Student("tohan",8));

		
		AgeRevSort nrs = new AgeRevSort();
		Collections.sort(list,nrs);
		
		Student s = new Student("karthik",42);
		System.out.println(Collections.binarySearch(list,s,nrs));		
	}
}