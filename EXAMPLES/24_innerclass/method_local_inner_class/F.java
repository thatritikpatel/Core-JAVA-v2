class F{
	//int y = 90;
	static int y = 90;

	static void abc(){
		class X{
			void mno(){
				System.out.println(y);
				y = 34;
			}
		}

		X x = new X();
		x.mno();
	}

	public static void main(String[] args){
		abc();
		abc();
	}
}