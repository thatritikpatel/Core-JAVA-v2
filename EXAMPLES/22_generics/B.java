import java.util.*;

class B{
	public static void main(String[] args){		
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(34);
		list.add(12);
		list.add(78);
		list.add(53);
		
		//Case 2:
		
		Iterator<Integer> itr = list.iterator();

		while(itr.hasNext()){
			Integer i = itr.next();
			System.out.println(i);
		}
		
		//Case 1:
		/*
		Iterator itr = list.iterator();

		while(itr.hasNext()){
			Integer i = (Integer)itr.next();
			System.out.println(i+" ~~");
		}*/
		
		
	}
}