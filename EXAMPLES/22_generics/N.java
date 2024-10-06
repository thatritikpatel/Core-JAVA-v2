import java.util.*;

class N{
	public static void main(String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(12);
		x.add(13);
		x.add(14);
		pro(x);

		ArrayList<Long> t = new ArrayList<Long>();
		t.add(12L);
		t.add(13L);
		t.add(14L);
		pro(t);
	}

	static void pro(ArrayList<Number> y){
		System.out.println("#####");
	}
	
	/*
	static void pro(ArrayList<Long> y){
		System.out.println("$$$$");
	}

	static void pro(ArrayList<Integer> y){
		System.out.println("#####");
	}*/
}