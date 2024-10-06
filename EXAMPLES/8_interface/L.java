interface A{
	/*final*/ int y = 12;
}

class L implements A{
	
	void pro(){
		//System.out.println(y);
		y = 67;
	}
}