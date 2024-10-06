class G{
	public static void main(String[] args){
		System.out.println(abc());
	}

	static int abc(){
		System.out.println("-----1");

		try{
			return 12;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return 100;
			//System.out.println("------xyz");	
		}
		//System.out.println("------2");
		//return 23;
	}
}