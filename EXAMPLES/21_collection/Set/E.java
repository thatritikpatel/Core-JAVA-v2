import java.util.HashSet;

class E{
	public static void main(String[] args){
		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();

		set.add("mohan");
		set.add("rohan");
		set.add("sohan");
		set.add("gohan");
		set.add("tohan");

		for(String str : set){
			System.out.println(str);
		}
	} 
}