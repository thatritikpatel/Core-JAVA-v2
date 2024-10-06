import java.io.*;

class X{
	X() throws FileNotFoundException{
		FileReader r = new FileReader(new File("Abc.txt"));
		System.out.println("X() --- end");
	}
}

class D extends X{
	/*
	D() throws FileNotFoundException{
		super();
	}*/

	/*
	D(){
		try{	super();}catch(FileNotFoundException e){ e.printStackTrace();}
	}*/

	/*
	D() throws FileNotFoundException{
		
	}*/
	public static void main(String[] args) throws FileNotFoundException{
		D x = new D();
		System.out.println("main() --- end");
	}
}