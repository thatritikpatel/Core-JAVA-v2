import java.io.*;

class B{
	public static void main(String[] args){		
		Address addr = new Address();
		Student st = new Student("Mohan",12,addr);
		
		try{
			FileOutputStream fos = new FileOutputStream("d.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}