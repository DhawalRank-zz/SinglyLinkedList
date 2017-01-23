/*
 * Created By: Dhawal Rank
 * Date: January 22, 2017
 */

public class MainLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		System.out.println("Size is: "+ll.getSize());
		System.out.println("Data: "+ll.toString());
		ll.prepend(10);
		System.out.println("Size is: "+ll.getSize());
		System.out.println("Data: "+ll.toString());
		ll.prepend(11);
		System.out.println("Size is: "+ll.getSize());
		System.out.println("Data: "+ll.toString());
		ll.prepend(12);
		System.out.println("Size is: "+ll.getSize());
		System.out.println("Data: "+ll.toString());
		ll.append(13);
		System.out.println("Size is: "+ll.getSize());
		System.out.println("Data: "+ll.toString());
		ll.removeLast();
		System.out.println("Data: "+ll.toString());
		ll.prepend(10);
		System.out.println("Data: "+ll.toString());
		ll.removeFirst();
		System.out.println("Data: "+ll.toString());
		ll.append(10);
		System.out.println("Data: "+ll.toString());
		ll.insertAt(1, 14);
		System.out.println("Data: "+ll.toString());
		LinkedList sortedList = ll.getSortedList();
		System.out.println("Sorted List: "+sortedList.toString());
	}

}
