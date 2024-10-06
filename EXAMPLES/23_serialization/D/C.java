import java.io.*;

class C{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("d.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();

			System.out.println("Name: "+s.name);
			System.out.println("Age: "+s.age);
			System.out.println("Address: "+s.address);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}