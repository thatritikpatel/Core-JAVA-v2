class A{
	public static void main(String[] args){
		//Case 3:
		Class x = null;
		try{
			x = Class.forName("A");
			System.out.println(x);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}	
		
		//Case 2:
		A a = new A();
		Class y = a.getClass();
		System.out.println(y);
		
		//Case 1:
		Class z = A.class;
		System.out.println(z);

		System.out.println(x==y);
		System.out.println(y==z);
	}
}