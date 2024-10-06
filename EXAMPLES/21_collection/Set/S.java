import java.util.TreeSet;

class Student implements Comparable<Student>{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}	

	public int compareTo(Student s){
		return this.age.compareTo(s.age); 
	}

	public String toString(){
		return name+"~"+age;
	}
}

class S{
	public static void main(String[] args){
		TreeSet<Student> set = new TreeSet<Student>();

		set.add(new Student("rohan",23));
		set.add(new Student("gohan",7));
		set.add(new Student("mohan",12));
		set.add(new Student("eohan",10));
		set.add(new Student("hohan",15));

		System.out.println(set);
	}
}