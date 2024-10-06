/*final*/ class M{
	void pro(){
		System.out.println("pro() in class M");
	}

	final void abc(){
		System.out.println("abc() in class M");
	}

	void pqr(){
		System.out.println("pqr() in class M");
	}
}

class G extends M{
	void pro(){
		System.out.println("pro() in class G");
	}

	/*
	void abc(){
		System.out.println("abc() in class G");
	}*/

	void pqr(){
		System.out.println("pqr() in class G");
	}

	public static void main(String[] args){
		G g = new G();

		g.abc();
		g.pqr();
		g.pro();
	}		
}










