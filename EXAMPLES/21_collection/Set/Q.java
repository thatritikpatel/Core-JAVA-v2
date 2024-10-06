import java.util.TreeSet;
import java.util.Comparator;
import java.io.Console;

class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
		this.name = name;
		this.age = age;
	}	

	public String toString(){
		return name+"~"+age;
	}
}

class NameSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.compareTo(nm2);
	}
}

class NameRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm2.compareTo(nm1);
	}
}

class AgeSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag1.compareTo(ag2);
	}
}

class AgeRevSort implements Comparator{
	public int compare(Object o1,Object o2){
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;

		Integer ag1 = s1.age;
		Integer ag2 = s2.age;

		return ag2.compareTo(ag1);
	}
}

class Q{
	public static void main(String[] args){
		Console c = System.console();		
		System.out.println("Enter  1 for NS, 2 for AS, 3 for NRS and 4 for ARS: ");

		String input = c.readLine();
		int value = Integer.parseInt(input);

		Comparator comp = null;
		
		if(value==1){
			comp = new NameSort();
		}else if(value==2){
			comp = new AgeSort();
		}else if(value==3){
			comp = new NameRevSort();
		}else if(value==4){
			comp = new AgeRevSort();
		}

		TreeSet set = new TreeSet(comp);

		set.add(new Student("rohan",23));
		set.add(new Student("gohan",7));
		set.add(new Student("mohan",12));
		set.add(new Student("eohan",10));
		set.add(new Student("hohan",15));

		System.out.println(set);
	}
}