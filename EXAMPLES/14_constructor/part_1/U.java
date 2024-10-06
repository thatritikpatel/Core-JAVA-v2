class Student{
	String name;
	int age;
	String college;
	String address;

	Student(String name,int age,String college,String address){
		this.name = name;
		this.age = age;
		this.college = college;
		this.address = address;
	}
}

class U{
	public static void main(String[] args){
		Student s = new Student("mohan",20,"Global","Jbp");

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.college);
		System.out.println(s.address);
	}
}