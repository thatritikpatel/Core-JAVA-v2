class J{
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
			
			String s = null;
			System.out.println(s.length());
		}catch(ArithmeticException e){
			System.out.println("AE");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("AIOBE");
		}catch(NumberFormatException e){
			System.out.println("NFE");
		}

		System.out.println("~~~~~~~~ 5");	
	}
}