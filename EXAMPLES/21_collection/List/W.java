import java.util.ArrayList;

class W{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		
		
		int len = list.size();
		for(int i=0;i<len;i++){
			System.out.println(list.remove(i));
		}
	}
}