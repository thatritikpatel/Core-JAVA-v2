import java.util.*;

class S{
	public static void main(String[] args){
		//ArrayList<A> x = new ArrayList<B>();
		ArrayList<? extends A> x = new ArrayList<B>();
	}
}

interface A{ }
class B implements A{ }