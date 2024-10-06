class M{
	public static void main(String[] args){
		M m = new M();
		T t = m.new T();
		t.abc();
	}

	class T{
		void abc(){
			System.out.println(w);
		}
	}

	private int w = 100;
}