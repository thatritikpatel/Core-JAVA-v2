class K{
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
		
		
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+"  ");
			}
			System.out.println();
		}

		//Case 1:
		/*
		for(int i=0;i<y.length;i++){
			//System.out.println(y[i]);
			System.out.println(y[i].length);
		}*/
	}
}