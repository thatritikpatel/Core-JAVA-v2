import java.util.Hashtable;

class J{
	public static void main(String[] args){
		Hashtable map = new Hashtable();
		
		map.put("mohan",12);
		map.put("sohan",34);
		//map.put("rohan",null);
		//map.put("gohan",null);
		map.put(null,77);
		//map.put(null,45);
		

		System.out.println(map);		
	}
}