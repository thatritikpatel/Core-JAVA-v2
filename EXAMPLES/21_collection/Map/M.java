import java.util.HashMap;

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

			int ag1 = s1.age;
			int ag2 = s2.age;

			if(nm1.equals(nm2)&&ag1==ag2){
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
		
		sum += age;
		//System.out.println("hashCode: "+sum);

		return sum;
	}


	public String toString(){
		return name+"~"+age;
	}
}

class M{
	public static void main(String[] args){
		HashMap<Student,String> map = new HashMap<Student,String>();

		map.put(new Student("mohan",23),"GGITS");
		map.put(new Student("rohan",12),"Global");
		map.put(new Student("tohan",7),"JEC");
		map.put(new Student("gohan",10),"Shree Ram");
		map.put(new Student("sohan",18),"Global");
		map.put(new Student("mohan",23),"Hitkarini");

		System.out.println(map);
	}
}