import java.io.*;

class Student implements Serializable{
	String name;
	int age;
	transient Address address;

	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.city.cityName);
			oos.writeObject(address.state.stateName);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			String ctNm = (String)ois.readObject();
			String stNm = (String)ois.readObject();
			address = new Address(new City(ctNm),new State(stNm));
		}catch(IOException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}


	Student(String name,int age,Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
}