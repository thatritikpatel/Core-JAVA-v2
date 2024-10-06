class Shape{
	int l;
	int w;
	int h;

	Shape(int l){
		this.l = l;
	}

	Shape(int l,int w){
		this.l = l;
		this.w = w;
	}

	Shape(int l,int w,int h){
		this(l,w);
		//this.l = l;
		//this.w = w;
		this.h = h;
	}
}

class X{
	public static void main(String[] args){
		Shape x = new Shape(34,56,2);

		System.out.println("length: "+x.l);
		System.out.println("width: "+x.w);
		System.out.println("height: "+x.h);
	}
}