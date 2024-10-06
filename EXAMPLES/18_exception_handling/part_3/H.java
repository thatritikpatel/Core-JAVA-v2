import java.io.*;

class T{
	public static void main(String[] args){
		abc();
	}

	static void abc(){
		mno();
	}

	static void mno(){
		pqr();
	}

	static void pqr() throws ArithmeticException{
		int y = 12/0;
	}
}