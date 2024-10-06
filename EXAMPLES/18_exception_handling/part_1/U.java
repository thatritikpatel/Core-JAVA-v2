class U{
	public static void main(String[] args){
		System.out.println("------- 1");
		
		try{
			int y = 12/0;
			System.out.println("------ a");
		}catch(ArithmeticException e){
			//System.out.println(e.getMessage());		
			//System.out.println(e);		
			//e.printStackTrace();		
		}
 
		System.out.println("------- 2");	
	}
}