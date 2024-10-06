interface A{
	/*static final*/ int x = 100;
}

class M implements A{
	public static void main(String[] args){
		System.out.println(x);
	}
}