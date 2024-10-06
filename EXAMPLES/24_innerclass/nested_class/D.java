class D{
	//int q = 9;
	//static int q = 9;
	private static int q = 9;

	static class Y{
		void pro(){
			System.out.println(q);
		}
	}

	public static void main(String[] args){
		Y y = new Y();
		y.pro();
	}
}