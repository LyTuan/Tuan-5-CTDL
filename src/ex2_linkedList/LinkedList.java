package ex2_linkedList;

public class LinkedList {
	public static void main(String args[]){
		FirstNode list1 = new FirstNode();
		System.out.println("After add first:");
		list1.addFirst(5);
		list1.addFirst(6);
		list1.addFirst(1);
		list1.print();
		System.out.println("After add last:");
		list1.addLast(2);
		list1.addLast(3);
		list1.addLast(4);
		list1.print();
		list1.removeFirst();
		System.out.println("After remove first:");
		list1.print();
		list1.findIndex(3);
	}
}
