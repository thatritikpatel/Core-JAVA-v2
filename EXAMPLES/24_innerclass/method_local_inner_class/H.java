class H extends Y{
	//int y = 2;

	void abc(){
		//int y = 23;
		
		class X extends Z{
			//int y = 7;
			void mno(){
				//int y = 56;
				System.out.println(y);
			}
		}

		X a = new X();
		a.mno();
	}

	public static void main(String[] args){
		new H().abc();
	}
}

class Z{
	//int y = 112;
}

class Y{
	int y = 200;
}