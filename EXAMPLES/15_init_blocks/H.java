class X{
	int y = 0;
}

class H extends X{
	int y = 1;
	
	{
		int y = 2;
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
	}

	public static void main(String[] args){
		H a = new H();
	}
}