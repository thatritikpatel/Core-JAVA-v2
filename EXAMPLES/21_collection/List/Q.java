import java.util.ArrayList;

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+"-"+age;
	}
}

class Q{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("mohan",12));
		list.add(new Student("rohan",15));
		list.add(new Student("sohan",10));
		list.add(new Student("gohan",9));
		list.add(new Student("tohan",17));
		
		Student s = new Student("rohan",15);
		System.out.println(list.contains(s));
	}
}