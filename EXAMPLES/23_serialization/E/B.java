import java.io.*;

class B{
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		Student x = (Student)new ObjectInputStream(new FileInputStream("e.txt")).readObject(); 

		System.out.println(x.name);
		System.out.println(x.age);
	}
}