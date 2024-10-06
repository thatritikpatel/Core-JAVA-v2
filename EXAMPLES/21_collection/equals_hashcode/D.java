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

class D{
	public static void main(String[] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("mohan",14);
		Student s3 = new Student("hanmo",17);
		Student s4 = new Student("rajesh",17);

		//Case 3:
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());

		//Case 2:
		/*
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		*/

		//Case 1:
		/*
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());*/
	}
}











