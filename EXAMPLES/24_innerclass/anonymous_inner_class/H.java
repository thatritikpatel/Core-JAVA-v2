interface X{ }

class H{
	static X x = new X(){
			private int y = 67;
		  };

	public static void main(String[] args){
		//System.out.println(y);
		//System.out.println(x.y);
	}
}
