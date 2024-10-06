class H{
	public static void main(String[] args){
		System.out.println("~~~~~~~~ 1");
		
		try{
			int x = Integer.parseInt(args[0]);
			System.out.println("~~~~~~~~ 2");

			int[] ar = {12,56,78};
			System.out.println(ar[x]);
			System.out.println("~~~~~~~~ 3");

			int y = 12/x;
			System.out.println("~~~~~~~~ 4");
		}catch(Exception e){
			System.out.println("###########\n"+e);
		}

		System.out.println("~~~~~~~~ 5");	
	}
}