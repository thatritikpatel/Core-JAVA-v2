abstract class W{
	int y = 90;
	W(){
		System.out.println("constructor in W");
	}
}

class S extends W{
	public static void main(String[] args){
		//Case 1:
		//W t = new W();

		//Case 2:
		S x = new S();
		System.out.println(x.y);
	}
}