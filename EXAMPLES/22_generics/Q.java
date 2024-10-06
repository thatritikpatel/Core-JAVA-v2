import java.util.*;

class Q{
	public static void main(String[] args){
		ArrayList<Integer> y = new ArrayList<Integer>();
		y.add(12);
		y.add(13);
		y.add(14);
		
		ArrayList<? extends Number> x = y;
		

		//x.add(12);
		//x.set(1,23);
		x.remove(1);

		System.out.println(x.get(0));
	}
}