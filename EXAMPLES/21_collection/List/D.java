import java.util.ArrayList;

class D{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("rohan");
		list.add("sohan");
		list.add("gohan");
		list.add("tohan");

		System.out.println(list);
		System.out.println(list.remove("sohan"));
		System.out.println(list);
	}
}