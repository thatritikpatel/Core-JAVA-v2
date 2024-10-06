import java.util.ArrayList;

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	
	public boolean equals(Object obj){
		Student s1 = this;
		Student s2 = (Student)obj;

		String nm1 = s1.name;
		String nm2 = s2.name;

		System.out.println(nm1+"~"+nm2);

		return nm1.equals(nm2);
	}

	public String toString(){
		return name+"-"+age;
	}
}

class S{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(new Student("mohan",12));
		list.add(new Student("gohan",15));
		list.add(new Student("sohan",10));
		list.add(new Student("gohan",9));
		list.add(new Student("tohan",17));
		
		Student s = new Student("mohan",12);
		System.out.println(list);
		System.out.println(list.remove(s));
		System.out.println(list);
	}
}