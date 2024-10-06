import java.util.LinkedList;

class Y{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		//Case 3:
		//As a Stack
		list.push("mohan");
		list.push("sohan");
		list.push("rohan");

		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());

		
		//Case 2:
		//As a Queue:
		/*
		list.offer(12);
		list.offer(13);
		list.offer(14);

		//System.out.println(list.peek());
		//System.out.println(list.peek());
		//System.out.println(list.peek());

		//System.out.println(list.poll());
		//System.out.println(list.poll());
		//System.out.println(list.poll());
		
		*/

		//Case 1:
		//As a List
		/*
		list.add(12);
		list.add(16);
		list.add(18);

		//System.out.println(list.get(1));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list.remove(0));
		System.out.println(list);
		*/
	}
}