import java.util.ArrayList;

class A{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mukesh");
		list.add("dinesh");
		list.add("ratnesh");
		list.add("mahesh");
		list.add("ganesh");

		Object[] arr = list.toArray();
		

		System.out.println(arr.length);
		for(Object obj : arr){
			System.out.println(obj);
		}
	} 
}