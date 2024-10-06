import java.util.ArrayList;
import java.util.Collections;


class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"~"+age;
	}
}

class B{
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