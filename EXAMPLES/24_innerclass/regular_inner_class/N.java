class N{
	class O{
		private int e = 9;
	}

	public static void main(String[] args){
		N n = new N();
		O o = n.new O();
		System.out.println(o.e);
	}
}