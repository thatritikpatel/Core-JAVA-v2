class Y{
	private Y(){
	
	}

	static Y createObject(){
		Y y = new Y();
		return y;
	}
}

class G{
	public static void main(String[] args){
		Y a = Y.createObject();
		Y b = Y.createObject();

		System.out.println(a);
		System.out.println(b);
	}
}