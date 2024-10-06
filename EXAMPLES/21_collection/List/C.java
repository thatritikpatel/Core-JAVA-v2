import java.util.ArrayList;

class C{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		System.out.println(a);

		a.add(12);
		a.add(67);
		a.add(89);
		a.add(42);

		System.out.println(a);

		System.out.println(a.size());
		System.out.println(a.isEmpty());
	}
}