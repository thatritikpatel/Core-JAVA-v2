interface Z{ 
	void abc();
}

class X implements Z { 
	public void abc(){
		System.out.println("Hello Mohan");
	}
}

class C{
	public static void main(String[] args){
		Z z = new X();
		z.abc();
	} 
}