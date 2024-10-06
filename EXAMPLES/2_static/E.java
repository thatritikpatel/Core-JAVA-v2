class Circle{
	int r;
	static float pi = 3.14f;
	
	void calcArea(){
		System.out.println(pi*r*r);
	}

	static void defineCircle(){
		System.out.println("Circle is a...........");
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.r = 12;

		Circle c2 = new Circle();
		c2.r = 15;

		c1.calcArea();
		c2.calcArea();
	}
}