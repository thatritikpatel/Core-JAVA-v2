import java.io.Console;

class B{
	public static void main(String[] args){
		Console c = System.console();
		String str = c.readLine();

		System.out.println("#############################");
		System.out.println(str);
		System.out.println("#############################");
	}
}