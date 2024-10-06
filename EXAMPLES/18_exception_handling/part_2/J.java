class J{
	public static void main(String[] args) throws CommandLineEmptyException{
		System.out.println("------1");

		if(args.length==0){
			throw new CommandLineEmptyException();
		}

		System.out.println("------2");

		System.out.println(args[0]);
	}
}

class CommandLineEmptyException extends Exception{

}