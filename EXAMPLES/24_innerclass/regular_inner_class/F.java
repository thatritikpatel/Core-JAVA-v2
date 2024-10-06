class F{
	int t = 34;

	void abc(){
		//Case 1:
		//System.out.println(t);
		//Y y = new Y();
		
		//Case 2:
		//System.out.println(this.t);
		//Y y = this.new Y();
	}

	class Y{

	}

	public static void main(String[] args){
		F f = new F();
		f.abc();

		//Case 3:	
		//Y w = new Y();
		//Y w = f.new Y();
	}
}