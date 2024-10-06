class Student{
	String name;
	int age;

	public boolean equals(Object obj){
		Student i = this;
		Student j = (Student)obj;

		String nm1 = i.name;
		String nm2 = j.name;

		return nm1.equals(nm2)&&i.age==j.age;
	}

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}
}

class D{
	public static void main(String[] args){
		String x = new String("mohan");		
		Student a = new Student(x,23);

		String y = new String("mohan");
		Student b = new Student(y,23);

		System.out.println(a==b);
		System.out.println(a.equals(b));

	}
}