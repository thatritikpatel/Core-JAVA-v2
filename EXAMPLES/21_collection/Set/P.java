import java.util.TreeSet;

class Student implements Comparable{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}	

	public int compareTo(Object o){
		Student s1 = this;
		Student s2 = (Student)o;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag1.compareTo(ag2); 
		
		//String nm1 = s1.name;
		//String nm2 = s2.name;

		//return nm1.compareTo(nm2);
	}

	public String toString(){
		return name+"~"+age;
	}
}

class P{
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