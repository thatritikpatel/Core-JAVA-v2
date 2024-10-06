import java.util.ArrayList;

class Z1{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		//ArrayList list = new ArrayList();

		list.add(12);
		list.add(23);
		list.add(67);
		list.add(89);
		
		/*
		list.add(12);
		list.add(3.45);
		list.add(true);
		list.add(new A());
		*/

		System.out.println(list.get(0).parseInt("2"));
		
	}
}