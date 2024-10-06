import java.io.*;

class B{
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		Student x = (Student)new ObjectInputStream(new FileInputStream("c.txt")).readObject();

		System.out.println(x.name);
		System.out.println(x.age);
		System.out.println(x.degree);
		System.out.println(x.branch);
		System.out.println(x.semester);
	}
}