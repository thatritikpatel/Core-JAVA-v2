import java.util.*;

class B{
	public static void main(String[] args){
		int[] x = {45,12,23,78,2,9};

		for(int i : x)
			System.out.print(i+" ");
		
		Arrays.sort(x);
		
		System.out.println();

		for(int i : x)
			System.out.print(i+" ");

	}
}