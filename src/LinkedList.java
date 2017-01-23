/*
 * Created By: Dhawal Rank
 * Date: January 22, 2017
 */
import java.util.Arrays;

public class LinkedList {
	
	private Node header;
	private static Node lastnode;
	private int size;
	
	public LinkedList(){
		header = new Node(null);
		lastnode = header;
	}
	public void prepend(Integer data){
		Node n = new Node(data);
		n.next = header;
		header = n;
		size++;
	}
	public void append(Integer data) {
		Node n = new Node(data);
		if(size == 0){
			header = n;
			header.next = lastnode;
			size++;
		}
		else {
			Node temp = header;
			int count = 1;
			while (count != size ){
				temp = temp.next;
				count++;
			}
			temp.next = n;
			temp.next.next = lastnode;
			size++;
		}
	}
	public int removeFirst(){
		int deletedNote = header.data;
		if(size != 0){
			header = header.next;
			size--;
		}
		return deletedNote;
	}
	public int removeLast(){
		int deletedNode = 0;
		if(size == 1){
			deletedNode = header.data;
			header.next = null;
			lastnode = header;
			size--;
		}
		else if(size != 0){
			Node temp = header;
			int count = 1;
			while (count != size-1){
				temp = temp.next;
				count++;
			}
			deletedNode = temp.next.data;
			temp.next = lastnode;
			size--;
		}
		return deletedNode;
	}
	public void insertAt(int index, Integer data){
		if(index == 1)
			prepend(data);
		else if(index == size+1)
			append(data);
		else if(index > size +1 || index == 0){
			throw new NullPointerException("Unable to insert: Index "+index+" Not Found");
		}
		else{
			int count = 1;
			Node n = new Node(data);
			Node temp = header;
			while(count != index-1){
				temp = temp.next;
				count++;
			}
			n.next = temp.next;
			temp.next = n;
			size++;
		}
	}
	
	public int deleteAt(int index){
		int deletedNode = 0;
		if(index == 1)
			deletedNode = removeFirst();
		else if(index == size)
			deletedNode = removeLast();
		else if(index > size || index == 0)
			throw new NullPointerException("Unable to delete: Index "+index+" Not Found");
		else{
			int count = 1;
			Node temp = header;
			while(count != index-1){
				temp = temp.next;
				count++;
			}
			deletedNode = temp.next.data;
			temp.next = temp.next.next;
			size--;
		}
		return deletedNode;
	}
	
	public int getSize(){
		return size;
	}

	public String toString(){
		Node n = header;
		String temp = "";
		while (n != null){
			temp = temp + n.data + " ";
			n = n.next;
		}
		return temp;
	}
	public LinkedList getSortedList(){
		LinkedList sortedList = new LinkedList();
		Node n = header;
		int i = 0;
		Integer a[] = new Integer[size];
		while(i != size){
			a[i] = n.data;
			i++;
			n = n.next;
		}
		Arrays.sort(a);
		i = 0;
		while(i < a.length){
			sortedList.append(a[i]);
			i++;
		}
		return sortedList; 
	}
}
