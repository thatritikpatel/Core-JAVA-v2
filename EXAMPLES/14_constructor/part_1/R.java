class R{
	R(){
		System.out.println("R()");
	}

	R(int y){
		this();
		System.out.println("R(int)");
	}

	public static void main(String[] args){
		R e = new R(12);
		System.out.println("main()");
	}
}
/*
output:
R()
R(int)
main()



Object()|     | x
R()     |     | x
R(int)  |  y  | x
main()  | e   |
*/








