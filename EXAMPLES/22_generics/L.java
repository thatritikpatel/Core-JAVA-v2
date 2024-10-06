import java.util.*;

class L{
	public static void main(String[] args){
		ArrayList<String> x = new ArrayList<String>();

		x.add("mohan");
		x.add("rohan");
		x.add("sohan");

		pro(x);
	}

	static void pro(ArrayList y){
		y.add(true);
		y.add(2.45);
		y.add(12);

		System.out.println(y);
	}
}