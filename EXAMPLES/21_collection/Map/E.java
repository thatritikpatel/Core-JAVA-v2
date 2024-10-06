import java.util.HashMap;

class E{
	public static void main(String[] args){
		HashMap map = new HashMap();
		
		map.put("mohan",12);
		map.put("sohan",34);
		map.put("rohan",23);
		map.put("gohan",23);
		map.put("tohan",15);
		

		System.out.println(map);
		System.out.println(map.get("rohan"));
		System.out.println(map);		
	}
}