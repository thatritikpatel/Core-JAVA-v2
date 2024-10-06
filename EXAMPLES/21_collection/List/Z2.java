import java.util.ArrayList;
import java.util.Iterator;

class Z2{
	public static void main(String[] args){
		
		ArrayList list = new ArrayList();	
		
		
		list.add(12);
		list.add(3.45);
		list.add(true);
		list.add(new A());
		

		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}