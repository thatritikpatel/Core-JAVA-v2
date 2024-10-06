import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student s = new Student();
		s.name = "Ganesh";
		s.age = 23;
		s.degree = "BTech";
		s.branch = "CS";
		s.semester = "3rd";

		new ObjectOutputStream(new FileOutputStream("c.txt")).writeObject(s);
	}
}