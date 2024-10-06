import java.util.TreeMap;

class O{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("ganesh",12);
		map.put("suresh",67);
		map.put("mahesh",23);
		map.put("dinesh",7);
		map.put("ramesh",99);

		//System.out.println(map.firstKey());
		//System.out.println(map.lastKey());
		//System.out.println(map.headMap("jignesh"));
		//System.out.println(map.headMap("dinesh"));
		System.out.println(map.tailMap("mahesh"));
	}
}