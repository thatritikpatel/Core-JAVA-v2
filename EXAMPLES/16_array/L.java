class L{
	public static void main(String[] args){
		//int[][] x = new int[][]{{12,34,56},{2,4},{90,3,56,23,67}};
		
		int[][] y = {{12,34,56},{2,4},{90,3,56,23,67}};

		for(int i=0;i<y.length;i++){
			for(int j=0;j<y[i].length;j++){
				//System.out.print(i+"-"+j+"\t");
				System.out.print(y[i][j]+"  ");
			}
			
			System.out.println();
		}
	}
}