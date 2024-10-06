class I{
	private int z = 88;

	void abc(){
		class X{
			void mno(){
				System.out.println(z);
			}
		}

		X a = new X();
		a.mno();
	}

	public static void main(String[] args){
		new I().abc();
	}
}