import java.util.ArrayList;

class M{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		
		
		for(Object obj : list){
			System.out.println(obj);
		}

		/*
		for(String str : list){
			System.out.println(str);
		}*/
	}
}