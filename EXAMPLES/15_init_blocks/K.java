class K{
	{
		System.out.println("inside inst. init. block --- B");
	}
	
	{
		System.out.println("inside inst. init. block --- A");
	}	

	public static void main(String[] args){
		System.out.println("inside main start");
		K a = new K();
		System.out.println("inside main end");
	}
}