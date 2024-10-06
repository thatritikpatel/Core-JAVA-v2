class R{
	R(){
		System.out.println(this);
	}
}

class Q extends R{
	Q(){
		System.out.println(this);
	}
}

class M extends Q{
	public static void main(String[] args){
		M k = new M();
		System.out.println(k);

		System.out.println("##############");
		
		M a = new M();
		System.out.println(a);
	}
}