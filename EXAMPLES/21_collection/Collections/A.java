import java.util.ArrayList;
import java.util.Collections;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(56);
		list.add(32);
		list.add(78);
		list.add(12);
		list.add(8);

		System.out.println(list);
		
		Collections.sort(list);

		System.out.println(list);
	}
}