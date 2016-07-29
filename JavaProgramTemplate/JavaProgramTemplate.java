public class JavaProgramTemplate {

	//Private Member Variables
	static String myString = "Hello, World";


	private static void printStuff(String inputString){

		System.out.println(inputString);

	}

	public static void main(String[ ] args) {
		
		if(args.length < 1){
			printStuff(myString);
		}
		else{
			for(String arg : args)
				printStuff(arg);

		}
		
	}

}