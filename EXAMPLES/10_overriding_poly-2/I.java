class Animal{ }
class Cat extends Animal{ }
class Cow extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
class Plant{ }

//Case 5:
/*
class A{
	Cat pro(){
		return null;
	}
}

class B extends A{
	Animal pro(){
		return null;	
	}
}*/

//Case 4:
/*
class A{
	Animal pro(){
		return null;
	}
}

class B extends A{
	BDog pro(){
		return null;	
	}
}*/


//Case 3:
/*
class A{
	Animal pro(){
		return null;
	}
}

class B extends A{
	Plant pro(){
		return null;	
	}
}*/

//Case 2:
/*
class A{
	Animal pro(){
		return null;
	}
}

class B extends A{
	Cat pro(){
		return null;	
	}
}*/


//Case 1:
/*
class A{
	Animal pro(){
		return null;
	}
}

class B extends A{
	Animal pro(){
		return null;	
	}
}*/