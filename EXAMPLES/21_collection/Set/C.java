import java.util.HashSet;

class C{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add(12);
		set.add(67);
		set.add(23);
		set.add(78);
		set.add(1);
		set.add(90);
		set.add(55);

		System.out.println(set.size());
		System.out.println(set.isEmpty());
		
	} 
}