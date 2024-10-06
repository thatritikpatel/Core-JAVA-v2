class L{
	int w = 1;

	class X{
		void abc(){
			System.out.println(w);
		}
	}

	public static void main(String[] args){
		L e = new L();
		L f = new L();

		e.w = 21;
		f.w = 56;

		X x1 = e.new X();
		X x2 = f.new X();

		x1.abc();
		x2.abc();
	}
}