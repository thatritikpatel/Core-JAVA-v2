class K{
	int y = 90;

	class T{
		void abc(){
			System.out.println(y);
		}
	}

	void mno(){
		System.out.println(y);
	}
	
	public static void main(String[] args){
		//K j = new K();
		//T t = j.new T();
		//or
		T t = new K().new T();
		t.abc();
	}
}