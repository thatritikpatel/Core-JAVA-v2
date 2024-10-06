//illegal overriding
/*
class A{
	void pro(){
	
	}
}

class B extends A{
	int pro(){
		return 1;
	}
}
*/

//legal overriding
/*
class A{
	void pro(){
	
	}
}

class B extends A{
	void pro(){
		
	}
}
*/