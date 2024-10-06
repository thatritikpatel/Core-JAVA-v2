class Student{
	String name;
	int age;

	Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	public String toString(){
		return name+" - "+age;
	}
}

class Z extends Student{

	public static void main(String[] args){
		Student s1 = new Student("ganesh", 12);
		Student s2 = new Student("raveesh", 22);
		
		System.out.println(s2);
		System.out.println(s1);
	}
}