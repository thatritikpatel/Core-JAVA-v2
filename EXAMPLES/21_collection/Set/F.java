import java.util.HashSet;
import java.util.Iterator;

class F{
	public static void main(String[] args){
		//HashSet set = new HashSet();
		HashSet<String> set = new HashSet<String>();

		set.add("mohan");
		set.add("rohan");
		set.add("sohan");
		set.add("gohan");
		set.add("tohan");

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
	} 
}