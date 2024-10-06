import java.util.HashSet;

class D{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add("mohan");
		set.add("rohan");
		set.add("sohan");
		set.add("gohan");
		set.add("tohan");

		System.out.println(set);
		//System.out.println(set.size());
		//System.out.println(set.isEmpty());

		//System.out.println(set.remove("sohan"));
		System.out.println(set.remove("eohan"));
		
		//System.out.println(set.contains("sohan"));
		//System.out.println(set.contains("eohan"));
		
		System.out.println(set);
		
	} 
}