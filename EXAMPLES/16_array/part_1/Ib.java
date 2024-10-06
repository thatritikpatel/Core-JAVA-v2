class Student{
	String name;
	int age;	
	
	public String toString(){
		return name+" - "+age;
	}

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class Ib{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("ganesh",23);

		System.out.println(s1);
		System.out.println(s1.toString());		

		System.out.println(s2);
		System.out.println(s2.toString());		

	}
}