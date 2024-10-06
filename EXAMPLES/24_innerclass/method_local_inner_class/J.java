class J{
	private int z = 88;

	void abc(){
		class X{
			private int e = 9;
			void mno(){
				System.out.println(z);
			}
		}

		X a = new X();
		a.mno();
		System.out.println(a.e);
	}

	public static void main(String[] args){
		new J().abc();
	}
}