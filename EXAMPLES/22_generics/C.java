import java.util.*;

class C{
	public static void main(String[] args){		
		ArrayList list = new ArrayList();

		list.add(34);
		list.add(12);
		list.add(78);
		list.add(53);
		
		Integer i = (Integer)list.get(2);
		System.out.println(i);
	}
}