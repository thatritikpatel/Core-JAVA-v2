import java.util.HashSet;

class A{
	public static void main(String[] args){
		HashSet set = new HashSet();

		set.add(12);
		set.add(67);
		set.add(23);
		set.add(78);
		set.add(1);
		set.add(90);
		set.add(55);

		System.out.println(set);
		System.out.println(set.remove(23));
		System.out.println(set);
	} 
}