class X{
	void abc(){
		System.out.println("Hello");
	}
}

class F{
	X x = new X(){
			void abc(){
				System.out.println("hi");
			}
		  };

	public static void main(String[] args){
		F f = new F();
		f.x.abc();
	}
}