import java.util.*;

class P{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(12);
		x.add(13);
		x.add(14);
		pro(x);

		ArrayList<Long> t = new ArrayList<Long>();
		t.add(16L);
		t.add(17L);
		t.add(18L);
		pro(t);
	}

	//Case 3:
	static void pro(ArrayList<? extends Number> y){
		System.out.println(y);
	}	

	//Case 2:
	/*
	static void pro(ArrayList<Number> y){
		System.out.println("#####");
	}
	*/

	//Case 1:
	/*
	static void pro(ArrayList<Long> y){
		System.out.println("$$$$");
	}

	static void pro(ArrayList<Integer> y){
		System.out.println("#####");
	}*/
}