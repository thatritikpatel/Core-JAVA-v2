class C{
	public static void main(String[] args){
		//Case 2:
		String a = "mohan";
		
		String s = new String(a);
		String t = new String(a);

		System.out.println(s==t);
		System.out.println(s==a);
		System.out.println(a==t);		

		System.out.println(a);		
		System.out.println(s);		
		System.out.println(t);		
	}
}