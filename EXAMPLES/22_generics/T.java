import java.util.*;

class T{
	public static void main(String[] args){
		ArrayList<?> x1 = new ArrayList<Integer>(); 
		ArrayList<?> x2= new ArrayList<Float>(); 
		ArrayList<?> x3 = new ArrayList<Double>(); 
		ArrayList<?> x4 = new ArrayList<Car>(); 
		ArrayList<?> x5 = new ArrayList<Cat>();
		
		ArrayList<? extends Object> e1 = new ArrayList<Integer>(); 
		ArrayList<? extends Object> e2= new ArrayList<Float>(); 
		ArrayList<? extends Object> e3 = new ArrayList<Double>(); 
		ArrayList<? extends Object> e4 = new ArrayList<Car>(); 
		ArrayList<? extends Object> e5 = new ArrayList<Cat>();

		ArrayList y1 = new ArrayList<Integer>(); 
		ArrayList y2= new ArrayList<Float>(); 
		ArrayList y3 = new ArrayList<Double>(); 
		ArrayList y4 = new ArrayList<Car>(); 
		ArrayList y5 = new ArrayList<Cat>(); 
		
		/*
		ArrayList<Object> z1 = new ArrayList<Integer>(); 
		ArrayList<Object> z2= new ArrayList<Float>(); 
		ArrayList<Object> z3 = new ArrayList<Double>(); 
		ArrayList<Object> z4 = new ArrayList<Car>(); 
		ArrayList<Object> z5 = new ArrayList<Cat>(); */
	}
}

class Car{ }
class Cat{ }