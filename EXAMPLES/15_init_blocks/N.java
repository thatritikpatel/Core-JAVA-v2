class N{
	//Case 4:
	public static void main(String[] args){
		new N();

		pro();
	}

	static void pro(){
		System.out.println(i);
	}

	N(){
		System.out.println(i);
	}

	static int i = 8;

	//Case 3:
	/*
	static {
		System.out.println("bye");
	}

	static int t = 9;
	*/


	//Case 2:
	/*
	static {
		System.out.println(r);
	}

	static int r = 90;
	*/

	//Case 1:
	/*
	static int r = 89;

	static {
		System.out.println(r);
	}*/
}