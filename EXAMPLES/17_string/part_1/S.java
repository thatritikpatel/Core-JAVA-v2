class S{
	public static void main(String[] args){
		String s = "abc23_ tyu#5-- 79pq#";

		String[] arr = s.split("\\d\\d");
		System.out.println(s);

		for(String str : arr){
			System.out.println(str);		
		}
	}
}