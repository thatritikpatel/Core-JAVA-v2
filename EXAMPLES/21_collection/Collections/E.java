import java.util.*;

class E{
	public static void main(String[] args){
		ArrayList list = new ArrayList();
		
		list.add(56);
		list.add(32);
		list.add(78);
		list.add(12);
		list.add(8);

		Collections.sort(list);

		//System.out.println(Collections.binarySearch(list,32));
		//System.out.println(Collections.binarySearch(list,56));
		
		//System.out.println(Collections.binarySearch(list,83));
		//System.out.println(Collections.binarySearch(list,47));
	}
}