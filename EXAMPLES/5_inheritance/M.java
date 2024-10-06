interface X{

}

class M implements X{
	public static void main(String[] args){
		M m = new M();

		//System.out.println(m instanceof M);
		//System.out.println(m instanceof Object);
		System.out.println(m instanceof X);
	}
}