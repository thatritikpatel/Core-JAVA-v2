import java.util.TreeMap;
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

class NameSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}
}

class NameRevSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.name.compareTo(s1.name);
	}
}

class AgeSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s1.age.compareTo(s2.age);
	}
}

class AgeRevSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
		return s2.age.compareTo(s1.age);
	}
}

class N{
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

		TreeMap map = new TreeMap(comp);

		map.put(new Student("rohan",23),"GGITS");
		map.put(new Student("gohan",7),"Global");
		map.put(new Student("mohan",23),"JEC");
		map.put(new Student("eohan",10),"Hitkarini");
		map.put(new Student("hohan",15),"Khalsa");

		System.out.println(map);
	}
}