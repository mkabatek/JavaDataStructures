import net.datastructures.*;

public class LinkedListDemo {

	//Private Member Variables
	static String myString = "Hello, World";
	


	private static void printStuff(String inputString){

		System.out.println(inputString);

	}

	public static void main(String[ ] args) {
		
		SinglyLinkedList<String> sLinkedList = new SinglyLinkedList<String>();
		

		printStuff("## SinglyLinkedList Test ##");

		sLinkedList.addFirst("ABC");
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());
		
		sLinkedList.addFirst("123");
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.addFirst("XYZ");
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.addFirst("#$%");
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.addFirst("***");
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		printStuff("SinglyLinkedList.toString():");
		printStuff(sLinkedList.toString());


		sLinkedList.removeFirst();
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());
		
		sLinkedList.removeFirst();
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.removeFirst();
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.removeFirst();
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		sLinkedList.removeFirst();
		printStuff("SinglyLinkedList.first(): " + sLinkedList.first());
		printStuff("SinglyLinkedList.size(): " + sLinkedList.size());

		printStuff("SinglyLinkedList.toString():");
		printStuff(sLinkedList.toString());



		
	}

}