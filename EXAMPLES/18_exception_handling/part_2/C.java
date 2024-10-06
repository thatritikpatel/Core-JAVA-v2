import java.io.*;

class C{
	public static void main(String[] args) throws FileNotFoundException{
		abc();
		System.out.println("in main----end");
	}

	static void abc() throws FileNotFoundException{
		mno();
		System.out.println("in abc----end");
	}

	static void mno() throws FileNotFoundException{
		pqr();
		System.out.println("in mno----end");
	}

	static void pqr() throws FileNotFoundException{
		File f = new File("abc.txt");
		FileReader r = new FileReader(f);
		System.out.println("in pqr----end");
	}
}