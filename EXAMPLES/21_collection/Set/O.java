import java.util.TreeSet;

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

class O{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(new Student("rohan",23));
		set.add(new Student("gohan",7));
		set.add(new Student("mohan",12));
		set.add(new Student("eohan",10));
		set.add(new Student("hohan",15));

		System.out.println(set);
	}
}