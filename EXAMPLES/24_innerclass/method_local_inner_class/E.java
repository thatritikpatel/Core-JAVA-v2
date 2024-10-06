class E{
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
		E x1 = new E();
		E x2 = new E();
		
		x1.y = 78;
		x2.y = 45;

		x1.abc();
		x2.abc();
	}
}