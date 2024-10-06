class D{
	public static void main(String[] args){
		String[] t = {"mohan","dheeraj","vikramaditya","purushottam","vighnesh"};
		
		//String[] r = null;

		String[] r = new String[t.length];

		for(int i=0;i<r.length;i++){
			r[i] = t[i];
		}

		for(int i=0;i<r.length;i++){
			System.out.println(r[i]+" ###############");
		}
	}
}