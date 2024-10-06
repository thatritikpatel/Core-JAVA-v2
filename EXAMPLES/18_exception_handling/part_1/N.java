class N{
	public static void main(String[] args){
		System.out.println("~~~~~~~ 1");
		
		try{
			int val = Integer.parseInt(args[0]);
			System.out.println("~~~~~~~ 2");

			int[] x = {2,45,78};
			System.out.println(x[val]);
			System.out.println("~~~~~~~ 3");

			int y = 12/val;
			System.out.println("~~~~~~~ 4");
		}
		System.out.println("~~~~~~~ 5");
		catch(Exception e){
			System.out.println(e);
			System.out.println("~~~~~~~ 6");
		}

		System.out.println("~~~~~~~ 7");
	}
}
