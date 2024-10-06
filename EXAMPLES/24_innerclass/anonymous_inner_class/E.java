abstract class X{
	abstract void abc();
}

class E{
	public static void main(String[] args){
		X x = new X(){
				int y = 90;

				void mno(){
					System.out.println("Hi...");
				}

				void abc(){
					System.out.println("Bye...");
				}	
			  };

		x.abc();
		//x.mno();
		System.out.println(x.y);
	}
}