class I{
	I abc(){
		System.out.println(this);
		return this;
	}

	public static void main(String[] args){
		I i = new I();
		System.out.println(i);
		
		I x = i.abc();
		System.out.println(x);
	}
}