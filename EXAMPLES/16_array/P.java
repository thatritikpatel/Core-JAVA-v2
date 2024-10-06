class P{
	public static void main(String[] args){
		int[][] y = {{12,34,56},{2,4},{90,3,56,23,67}};
		
		for(int[] a : y){
			for(int b : a){
				System.out.print(b+"-");
			}
			System.out.println();
		}	

		/*
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				System.out.print(y[i][j]+"  ");
			}
			System.out.println();
		}*/
	}
}