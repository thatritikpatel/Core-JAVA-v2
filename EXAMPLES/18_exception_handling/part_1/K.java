//Case 2:
class K{
	public static void main(String[] args){
		try{
			int[] ar = {12,56,34};
			System.out.println(ar[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}


//Case 1:
/*
class K{
	public static void main(String[] args){
		try{
			int[] ar = {12,56,34};
			System.out.println(ar[3]);
		}catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
	}
}
*/