import java.util.ArrayList;

class V{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		

		for(int i=0;i<list.size();i++){
			System.out.println(list.remove(i));
		}
	}
}