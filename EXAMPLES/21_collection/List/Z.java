import java.util.ArrayList;

class Z{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add(12);
		list.add(3.45);
		list.add(true);
		list.add(new A());

		//System.out.println(list.get(0).parseInt("2"));
		System.out.println(((Integer)list.get(0)).parseInt("2"));

		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}