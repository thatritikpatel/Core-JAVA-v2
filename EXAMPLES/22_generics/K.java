import java.util.ArrayList;

class K{
	public static void main(String[] args){
		ArrayList a = new ArrayList();

		a.add(12);
		a.add(2.3);
		a.add(true);

		pro(a);
	}

	static void pro(ArrayList<Integer> ar){
		ar.add(45);
		ar.add(78);

		System.out.println(ar);
	}
}