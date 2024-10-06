class F{
	int w = 9;

	void abc(){
		T t = new T();
		t.mno();
	}

	static class T{
		void mno(){
			System.out.println(w);
		}
	}

	public static void main(String[] args){
		F f = new F();
		f.abc();
	} 
}