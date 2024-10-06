import java.util.ArrayList;

class B{
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();

		list.add("mukesh");
		list.add("dinesh");
		list.add("ratnesh");
		list.add("mahesh");
		list.add("ganesh");

		String[] sarr = new String[0];
		String[] arr = list.toArray(sarr);
		

		System.out.println(arr.length);
		for(String str : arr){
			System.out.println(str+" ~~~");
		}
	} 
}