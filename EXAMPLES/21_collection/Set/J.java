import java.util.HashSet;

class Student{
	String name;
	int age;

	Student(String name,int age){
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj){
		boolean flag = false;

		if(obj instanceof Student){
			Student s1 = this;
			Student s2 = (Student)obj;

			String nm1 = s1.name;
			String nm2 = s2.name;

			if(nm1.equals(nm2)){
				flag = true;
			}
		}

		return flag;
	}

	public int hashCode(){
		int sum = 0;
		String abcd = " abcdefghijklmnopqrstuvwxyz";

		for(int i=0;i<name.length();i++){
			sum += abcd.indexOf(name.charAt(i));
		}		

		//System.out.println("hashCode: "+sum);

		return sum;
	}

	public String toString(){
		return name+"~"+age;
	}
}

class J{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add(new Student("mohan",23));
		set.add(new Student("sohan",9));
		set.add(new Student("rohan",12));
		set.add(new Student("mohan",23));
		set.add(new Student("gohan",15));
		set.add(new Student("tohan",7));

		System.out.println(set);
		//System.out.println(set.size());
		//System.out.println(set.isEmpty());

		Student s = new Student("sohan",9);
		System.out.println(set.remove(s));
		//System.out.println(set.contains(s));
		System.out.println(set);
	}
}

