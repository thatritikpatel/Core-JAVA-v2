class H{
	public static void main(String[] args){
		//int y = 89;
		//H y = null;
		H y = new H();
		
		System.out.println(y);
		System.out.println(y.toString());

		y.go();
	}

	void go(){
		System.out.println(this);	
	}
}