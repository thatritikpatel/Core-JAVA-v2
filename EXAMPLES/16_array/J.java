class J{
	public static void main(String[] args){
		String[][] y = new String[3][];

		y[0] = new String[2];		
		y[1] = new String[5];		
		y[2] = new String[1];		

		y[0][0] = "a1";
		y[0][1] = "a2";

		y[1][0] = "b1";
		y[1][1] = "b2";
		y[1][2] = "b3";
		y[1][3] = "b4";
		y[1][4] = "b5";

		y[2][0] = "c1";

		System.out.println(y[0][0]);
		System.out.println(y[0][1]);

		System.out.println(y[1][0]);
		System.out.println(y[1][1]);
		System.out.println(y[1][2]);
		System.out.println(y[1][3]);
		System.out.println(y[1][4]);

		System.out.println(y[2][0]);
	}
}