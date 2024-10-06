class F{
	public static void main(String[] args){
		System.out.println("------- 1");
		
		try{
			//String s = "mohan";
			//String s = null;
			System.out.println(s.length());
			System.out.println("------ a");
		}catch(NullPointerException e){
			System.out.println("NPE");		
		}
 
		System.out.println("------- 2");	
	}
}