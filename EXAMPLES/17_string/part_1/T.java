class T{
	public static void main(String[] args){
		String s = "mohan,sohan,rohan,ganesh,dinesh";

		//String[] arr = s.split(",");
		String[] arr = s.split("a");
		
		System.out.println(s);

		for(String str : arr){
			System.out.println(str);		
		}
	}
}