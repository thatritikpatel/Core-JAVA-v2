class X{
	void abc(){
		System.out.println("Hello");
	}
}

class G{
	private int y = 22;

	X x = new X(){
			void abc(){
				System.out.println(y);
			}
		  };

	public static void main(String[] args){
		G f = new G();
		f.x.abc();
	}
}