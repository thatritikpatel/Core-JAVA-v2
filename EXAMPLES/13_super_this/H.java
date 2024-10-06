class X{
	static void pro(H x){
		System.out.println(x);
		System.out.println(x.a);}}

class H{
	int a;
	void abc(){
		a = 99;
		X.pro(h);
	}
	public static void main(String[] args){
		H h =new H();
		System.out.println(h.a);
		System.out.println(h);
		h.abc();
	}
}