import java.io.*;

class A{
	public static void main(String[] args)throws IOException{		
		Student s = new Student();
		s.name = "Mahishmati";
		s.age = 34;

		new ObjectOutputStream(new FileOutputStream("e.txt")).writeObject(s);	
	}
}