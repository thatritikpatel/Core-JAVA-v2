class F{
	int a = 23;

	void pro(){
		int a = 89;
		//System.out.println(f1);
		System.out.println(this); //<===
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args){
		F f1 = new F();
		
		System.out.println(f1);
		System.out.println(f1.a);
		f1.pro();
	}
}