import java.util.ArrayList;

class G{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(34);
		list.add(2);
		list.add(89);
		list.add(2);
		list.add(12);

		System.out.println(list);
		System.out.println(list.remove(new Integer(14)));
		System.out.println(list);
	}
}