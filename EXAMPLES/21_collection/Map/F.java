import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class F{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		map.put("mohan",12);
		map.put("sohan",34);
		map.put("rohan",23);
		map.put("gohan",23);
		map.put("tohan",15);
		
		Set set = map.keySet();
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str+" : "+map.get(str));
		}
	}
}