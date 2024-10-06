import java.util.ArrayList;

class F{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(34);
		list.add(2);
		list.add(89);
		list.add(2);
		list.add(12);

		System.out.println(list);
		System.out.println(list.remove(new Integer(2)));
		System.out.println(list);
	}
}