class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class Ia{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("rohan",34);
		Student s3 = new Student("sohan",23);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}