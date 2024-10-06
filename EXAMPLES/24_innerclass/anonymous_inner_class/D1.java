interface Z{
	void abc();
}

class D1{
	public static void main(String[] args){
		Z z1 = new Z(){
				public void abc(){
					System.out.println("Hello Ganesh");
				}
		      };

		Z z2 = new Z(){
				public void abc(){
					System.out.println("Hi Ganesh");
				}
		      };

		z1.abc();
		z2.abc();
	}
}