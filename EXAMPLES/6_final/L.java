class Circle{
	int radius;
	static final float PI = 3.14f;

	void calcArea(){
		System.out.println(pi*radius*radius);
	}

	public static void main(String[] args){
		Circle c1 = new Circle();
		c1.radius = 12;

		Circle c2 = new Circle();
		c2.radius = 23;
	}
}