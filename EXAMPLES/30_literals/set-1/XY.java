import java.io.*;

class XY{
	public static void main(String[] args) throws IOException{
		File f = new File("C://Drives/test.html");
		String str = "";
		FileReader fr = new FileReader(f);
		
		int ch = 0 ;
		while((ch=fr.read())!=-1){
			str += (char)ch;
		}

		Pattern p = Pattern.compile(str);

	}
}