import java.util.ArrayList;

class K{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		

		System.out.println(list);
		//System.out.println(list.get(3));		
		System.out.println(list.remove(3));		
		//System.out.println(list.get(13));		
		System.out.println(list);
	}
}