import java.util.TreeMap;

class P{
	public static void main(String[] args){
		TreeMap map = new TreeMap();

		map.put("ganesh",12);
		map.put("suresh",67);
		map.put("mahesh",23);
		map.put("kamlesh",78);
		map.put("dinesh",7);
		map.put("ramesh",99);
		map.put("lankesh",22);
		map.put("vighesh",19);


		//System.out.println(map.ceilingEntry("naresh"));
		//System.out.println(map.ceilingEntry("mahesh"));
		//System.out.println(map.ceilingEntry("yogesh"));
		//System.out.println(map.ceilingKey("mukesh"));
		
		//System.out.println(map.floorKey("mukesh"));
		System.out.println(map.headMap("mahesh",true));
	}
}