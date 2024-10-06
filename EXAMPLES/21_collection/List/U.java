import java.util.ArrayList;

class U{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		

		System.out.println(list);		
		//System.out.println(list.set(5,"eohan"));
		//list.add(5,"eohan");
		list.add(6,"eohan");
		System.out.println(list);
	}
}