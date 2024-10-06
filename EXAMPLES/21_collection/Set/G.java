import java.util.HashSet;

class G{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add("mohan");
		set.add("gohan");
		set.add("rohan");
		set.add("mohan");
		set.add("tohan");
		set.add("mohan");

		System.out.println(set);
	}
}