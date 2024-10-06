class T{
	T(){		
		System.out.println("Inside T()");
	}
}

class Z extends T{
	Z(){
		System.out.println("Inside Z()");
	}
}

class H extends Z{
	public static void main(String[] args){
		H x = new H();
		System.out.println("Inside main()");
	}
}