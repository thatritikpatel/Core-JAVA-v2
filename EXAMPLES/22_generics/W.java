class W{

	<T> W(T t){
		
	}

	W(){
	
	}
	
	<T> void add(T t){
	
	}

	/*
	<?> void remove(){
	
	}

	<? extends T> void remove(T t){
	
	}*/

	/*
	void add(Object o){
	
	}*/

	/*
	void add(Car car){
	
	}

	void add(Bus bus){
	
	}*/

	public static void main(String[] args){
		W w = new W();
		w.add(new Car());
		w.add(new Bus());
		w.add(new Cat());
	}
}