class G{
	static void abc(){
		int y = 23;
		
		class X{
			void mno(){
				System.out.println(y);
			}
		}

		X a = new X();
		a.mno();
	}

	public static void main(String[] args){
		abc();
	}
}