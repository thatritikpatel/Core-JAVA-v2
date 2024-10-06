import java.io.*;


//Case 3:
/*
class W{
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File("abc.txt");
		
		FileReader a = new FileReader(f);		

		System.out.println("----1");
	}
}*/

//Case 2:
/*
class W{
	public static void main(String[] args){
		File f = new File("abc.txt");
		
		try{
			FileReader a = new FileReader(f);		
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}

		System.out.println("----1");
	}
}*/


//Case 1:
/*
class W{
	public static void main(String[] args){
		File f = new File("abc.txt");
		
		FileReader a = new FileReader(f);		

		System.out.println("----1");
	}
}*/