import java.util.Arrays;

public class ArrayCloneTest {

	//Private Member Variables
	static String myString = "Hello, World";
	static int[] data = {2, 3, 4, 5, 6, 7};
	static int[] backup;


	private static void printStuff(String inputString){

		System.out.println(inputString);

	}

	public static void main(String[ ] args) {
		
		

		printStuff("data: " + Arrays.toString(data));
		printStuff("Assign data's reference to backup");
		printStuff("backup = data;");
		backup = data;

		printStuff("backup now contains a reference/alias to the data variable ...");

		printStuff("changing value in data: data[2] = 10;");
		data[2] = 10;
		printStuff("data: " + Arrays.toString(data));
		printStuff("backup: " + Arrays.toString(backup));

		printStuff("!!! Notice Both Arrays Changed !!!");


		printStuff("");
		printStuff("## Reset variables ##");
		printStuff("");
		data = new int[] {2, 3, 4, 5, 6, 7};
		backup = new int[] {};

		printStuff("data: " + Arrays.toString(data));
		printStuff("clone data to backup to make a copy");
		printStuff("backup = data.clone();");
		backup = data.clone();

		printStuff("COPY data to new variable backup using .clone()...");

		printStuff("changing value in data: data[2] = 10;");
		data[2] = 10;
		printStuff("data: " + Arrays.toString(data));
		printStuff("backup: " + Arrays.toString(backup));
		printStuff("!!! Notice only data Array Changed !!!");

		
	}

}