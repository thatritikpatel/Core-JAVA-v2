import java.io.*;

class X{
	public static void main(String[] args){
		File file = new File("aa.html");
		
		try{
			FileWriter fw = new FileWriter(file);

			fw.write("\u2EA8");

			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
}