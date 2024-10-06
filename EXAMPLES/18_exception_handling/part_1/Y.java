import java.io.*;

class Y{
	public static void main(String[] args){
		try{
			
			throw new Y();
			//throw new LowBalanceException();		
			//throw new Error();
			//throw new Exception();
			//throw new FileNotFoundException();
			//throw new ArithmeticException();
			//throw new NullPointerException();
		}catch(Throwable e){
			e.printStackTrace();
		}
	}
}

class LowBalanceException{

}