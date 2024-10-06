class W{
	W(float e){
		System.out.println("W()");
	}
}

class Z extends W{
	public static void main(String[] args){
		System.out.println("main ----- start");
		Z s = new Z();
		System.out.println("main ----- end");
	}
}