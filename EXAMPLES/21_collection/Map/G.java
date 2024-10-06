import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

class G{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		map.put("mohan",12);
		map.put("sohan",34);
		map.put("rohan",23);
		map.put("gohan",23);
		map.put("tohan",15);
		
		Set<Map.Entry> set = map.entrySet();
		
		Iterator<Map.Entry> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry entry = itr.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}