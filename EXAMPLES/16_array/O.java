interface X{ }
class W implements X{ }
class T implements X{ }

class O{
	public static void main(String[] args){
		//Case 7: ---NOT OK
		/*
		X[] z = new X[2];
		z[0] = new W();
		z[1] = new W();

		for(W y : z){
			System.out.println(y);
		}*/		
		
		//Case 6:
		/*
		X[] z = new X[2];
		z[0] = new W();
		z[1] = new T();

		for(X y : z){
			System.out.println(y);
		}*/
		
		//Case 5:
		/*
		X[] z = new X[2];
		System.out.println(z.length);
		System.out.println(z[0]);
		System.out.println(z[1]);
		*/

		//Case 4:
		//X[] z = new X[2];
		
		//Case 3:
		//X a = new W();
		
		//Case 2:
		//X a = new X();
		
		//Case 1:
		//X a;	
	}
}