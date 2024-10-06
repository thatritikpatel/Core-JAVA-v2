import java.io.*;

class B{
	public static void main(String[] args) throws ClassNotFoundException,IOException{
		
		Student x = (Student)new ObjectInputStream(new FileInputStream("a.txt")).readObject();

		System.out.println("name: "+x.name);
		System.out.println("age: "+x.age);
		System.out.println("city: "+x.address.city.cityName);
		System.out.println("state: "+x.address.state.stateName);
	} 
}