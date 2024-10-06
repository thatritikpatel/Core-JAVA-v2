import java.util.*;

class O{
	public static void main(String[] args){
		//ArrayList<Number> x = new ArrayList<Integer>();
		//ArrayList<Number> x = new ArrayList<Float>();

		ArrayList<? extends Number> x1 = new ArrayList<Integer>();
		ArrayList<? extends Number> x2 = new ArrayList<Float>();
		ArrayList<? extends Number> x3 = new ArrayList<Double>();
		ArrayList<? extends Number> x4 = new ArrayList<Byte>();
		ArrayList<? extends Number> x5 = new ArrayList<Short>();
	}
}