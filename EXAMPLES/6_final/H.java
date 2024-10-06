class X{
	final void abc(){
		System.out.println("abc() in class X ---");
	}
}

class H{
	public static void main(String[] args){
		X x = new X();
		x.abc();
	}
}