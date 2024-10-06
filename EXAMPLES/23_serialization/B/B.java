import java.io.*;

class B{
	public static void main(String[] args){
		City c = new City("Jabalpur");
		State s = new State("MP");
		Address addr = new Address(c,s);
		Student st = new Student("Mohan",12,addr);
		
		try{
			FileOutputStream fos = new FileOutputStream("b.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(st);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}