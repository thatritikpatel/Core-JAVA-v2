class J{
	void abc(){
		System.out.println("Hello");
	}

	static J j = new J(){
					void abc(){
						System.out.println("Bye");
					}
				};
	
	public static void main(String[] args){
		j.abc();
	}
}