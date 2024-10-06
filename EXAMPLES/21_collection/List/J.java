import java.util.ArrayList;

class J{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		

		System.out.println(list);
		System.out.println(list.add(2,"eohan"));
		//System.out.println(list.set(2,"eohan"));
		System.out.println(list);
	}
}