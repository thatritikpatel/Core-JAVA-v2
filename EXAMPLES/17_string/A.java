class A{
	public static void main(String[] args){
		String s = "  mohankumar    ";

		System.out.println(s.toUpperCase().replace('A','i').trim().substring(3,8));
	}
}