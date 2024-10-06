class P{
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

			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("~~~~~~~ AIOBE");
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("~~~~~~~ AE");
		}finally{
			System.out.println("###############");	
		}

		
		System.out.println("~~~~~~~ 7");
	}
}
