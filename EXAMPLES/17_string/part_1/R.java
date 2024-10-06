class R{
	public static void main(String[] args){
		String s = "mohan is a good student";

		String[] arr = s.split(" ");
		System.out.println(arr.length);

		for(String str : arr){
			System.out.println(str+" - "+str.length());		
		}
	}
}