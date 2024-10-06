class I{
	static {
		System.out.println("inside static block --- C");
	}

	static {
		System.out.println("inside static block --- A");
	}

	static {
		System.out.println("inside static block --- B");
	}

	public static void main(String[] args){
		System.out.println("inside main");
	}
}