class O{
	int y = 1;

	void mno(){
		System.out.println("outer O mno()");
	}

	class T extends P{
		void abc(){
			System.out.println(y);
		}
	}

	public static void main(String[] args){
		T t = new O().new T();
		t.abc();
		t.mno();
	}
}

class P{
	int y = 2;

	void mno(){
		System.out.println("parent P mno()");
	}
}