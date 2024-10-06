class Y{

}

final class X extends Y{
	
}

class F{
	public static void main(String[] args){
		Y x = new X();
		
		X y = (X)x;
	}
}