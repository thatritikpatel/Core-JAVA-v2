import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
		Student s = new Student("mohan",23,new Address(new City("Jbp"),new State("MP")));

		new ObjectOutputStream(new FileOutputStream("a.txt")).writeObject(s);
	}
}