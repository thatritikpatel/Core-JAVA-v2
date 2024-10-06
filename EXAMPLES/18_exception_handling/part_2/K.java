class K{
	public static void main(String[] args) throws CommandLineEmptyException{
		System.out.println("------1");

		if(args.length==0){
			try{
				throw new CommandLineEmptyException("Missing Command Line Argument");
			}catch(CommandLineEmptyException e){
				//System.out.println(e.getMessage());
				//e.printStackTrace();
			}
		}

		System.out.println("------2");
	}
}

class CommandLineEmptyException extends Exception{
	CommandLineEmptyException(){
	
	}

	CommandLineEmptyException(String message){
		super(message);
	}
}










