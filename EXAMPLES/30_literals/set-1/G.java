class G 
{
	public static void main(String[] args) 
	{
		//Case 1:
		//int y = 4;
		//System.out.println(y);
		
		//Case 2 & 3:
		//G t = new G();
		//System.out.println(t);
		//System.out.println(t.toString()+" ---");//Case 2:
		
		//Case 4:
		//G u = null;
		//System.out.println(u.go());
		//System.out.println(u);
		
		//Case 5:
		//G t = new G();
		//t.go();
	}

	//Case 3, 4 & 5:
	/*
	public String toString(){
		return "Hello...!";
	}*/

	//Case 4 & 5
	
	int go(){
		//System.out.println(toString());
		//System.out.println(super.toString());
		return 23;
	}
}
