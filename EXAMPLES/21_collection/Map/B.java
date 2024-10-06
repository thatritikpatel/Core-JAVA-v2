import java.util.HashMap;

class B{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		map.put("mohan",12);
		map.put("sohan",34);
		map.put("rohan",23);
		map.put("gohan",23);
		map.put("tohan",15);
		

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
	}
}