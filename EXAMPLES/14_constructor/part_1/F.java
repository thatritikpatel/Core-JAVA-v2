class F{
	int y;
	float r;
	char e = 'A';

	//Compiler Supplied Constructor
	/*
	F(){
		y = 0;
		r = 0.0;
		e = 'A';
	}
	*/

	public static void main(String[] args){
		F f = new F();
		
		System.out.println(f.y);
		System.out.println(f.r);
	}
}