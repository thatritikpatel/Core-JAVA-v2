class Student{
	String name;
	int age;
	String college;
	String address;
}

class T{
	public static void main(String[] args){
		Student s = new Student();

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.college);
		System.out.println(s.address);

		s.name = "ganesh";
		s.age = 10;
		s.college = "GGITS";
		s.address = "Bhopal";

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.college);
		System.out.println(s.address);
	}
}