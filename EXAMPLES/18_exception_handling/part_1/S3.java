class S3{
	public static void main(String[] args){
		System.out.println("--------1");
		abc(); 		System.out.println("--------2");
	}

	static void abc(){ try{  mno();	}catch(ArithmeticException e){System.out.println(e); }		
	System.out.println("--------3");}

	static void mno(){		
		pqr();
		System.out.println("--------4");
	}

	static void pqr(){	System.out.println("--------5");
		int y = 12/0; 		System.out.println("--------6");
	}
}