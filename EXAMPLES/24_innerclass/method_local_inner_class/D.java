class D{
	int y = 90;

	void abc(){
		class X{
			void mno(){
				System.out.println(y);
			}
		}

		X a = new X();
		a.mno();
	}

	public static void main(String[] args){
		D x = new D();
		x.abc();
	}
}