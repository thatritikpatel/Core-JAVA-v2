class E{
	public static void main(String[] args){
		String[] t = {"mohan","dheeraj","vikramaditya","purushottam","vighnesh"};

		//String[] r = null;

		String[] r = new String[t.length];
		
		for(int i=0,j=t.length-1;j>=0;i++,j--){
			r[i] = t[j];
		}
	
		/*
		for(int i=0;i<t.length;i++){
			r[t.length-i-1] = t[i];

		//i=0 => r[5-0-1] = t[0]
		//i=1 => r[5-1-1] = t[1]
		}*/

		for(int i=0;i<t.length;i++){
			System.out.println(r[i]);
		}


	}
}