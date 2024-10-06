class G{
	int a = 23;

	void pro(){
		int a = 89;
		System.out.println(this); 
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args){
		G f1 = new G(); System.out.println(f1);
		f1.pro();
		
		G f2 = new G(); System.out.println(f2);
		f2.a = 42; 
		f2.pro();		
	}
}