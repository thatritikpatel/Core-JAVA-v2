import java.io.*;

class C{
	public static void main(String[] args){
		try{
			FileInputStream fis = new FileInputStream("b.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student)ois.readObject();

			System.out.println("Name: "+s.name);
			System.out.println("Age: "+s.age);
			System.out.println("City: "+s.address.city.cityName);
			System.out.println("State: "+s.address.state.stateName);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}