class C{
	void abc(){
		//Case 1:
		//X x = null;
		
		class X{
			void mno(){
				System.out.println("hello");
			}
		}
		
		//Case 2:
		//X x = null;

		//Case 3:
		X x = new X();
		x.mno();
	}

	public static void main(String[] args){
		C x = new C();
		x.abc();
	}
}