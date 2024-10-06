import java.io.*;

class B{
	public static void main(String[] args){
		File file = new File("a.txt");
		
		try{
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Shape s = (Shape)ois.readObject();

			System.out.println("length: "+s.l+" -width: "+s.w+" -height: "+s.h);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}