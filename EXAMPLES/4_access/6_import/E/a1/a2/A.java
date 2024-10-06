package a1.a2;

//Case 5:
import b1.b2.*;
import b1.*;

//Case 4:
//import b1.B;

//Case 1:
//import b1.b2.B;
//import b1.*;

//Case 2:
//import b1.b2.*;
//import b1.B;

class A{
	public static void main(String[] args){
		//Case 4:
		/*
		B x = new B();
		x.abc();
		b1.b2.B y = new b1.b2.B();
		y.abc();
		*/
		
		//Case 3:
		/*
		b1.B x = new b1.B();
		x.abc();
		b1.b2.B y = new b1.b2.B();
		y.abc();
		*/

		//Case 1,2 and 5
		//B x = new B();
		//x.abc();
	} 
}