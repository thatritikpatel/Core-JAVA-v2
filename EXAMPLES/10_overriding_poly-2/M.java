//Private Access Controlled Method :: NOT An Overriding

//Case 4:
class A{
	private void pro(){
	
	}
}

class B extends A{
	private void pro(){
	
	}
}

//Case 3:
/*
class A{
	private void pro(){
	
	}
}

class B extends A{
	protected void pro(){
	
	}
}*/

//Case 2:
/*
class A{
	private void pro(){
	
	}
}

class B extends A{
	public void pro(){
	
	}
}*/

//Case 1:
/*
class A{
	private void pro(){
	
	}
}

class B extends A{
	void pro(){
	
	}
}*/