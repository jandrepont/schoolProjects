import java.util.*;
import java.lang.*;
import java.util.NoSuchElementException;
public class SinglyLinkedList<T> implements Iterable<T>
{

//instance variables
	private int size;
	private Node head;
	private Node tail;
	
	//need to get node to know the next node, 
	private static class Node<T>{
   
   		private T data;
   		private Node<T> next;
   	
   		public Node(T data, Node<T> n) {
    		this.data = data;
			this.next = n;
   		}
		
		public Node(T data) {
        	this(data, null);
    	}
	
		public T getData() {
        	return this.data;
    	}
		
	
    	public void setData(T data) {
        	this.data = data;
    	}

   	 	public Node getNext() {
        	return this.next;
    	}

    	public void setNext(Node nextNode) {
        	this.next = nextNode;
   	 	}

		//prints out the contents of a node
    	public void displayNode() {
          	System.out.print( data + " ");
    	}
	}

	private Node getNode(int index) {

    	if ( index > size ) {
        	throw new IllegalArgumentException("The index [" + index + "] is greater than the current size [" + size + "].");
    	}
    	Node current = head;
    	for (int i = 1; i < index; i++) {
        	current = current.getNext();
    	}

    	return current;
}
	
	public T getT(int index) {
    	T target = (T)getNode(index).getData();
		return target;
	}	
	public void insert(T data, int index){
		
		Node temp = new Node(data);
    	Node curr = head;
		if (index > size) {
        	throw new IllegalArgumentException("The index [" + index + "] is greater than the currentent size [" + size + "].");
    	}
		else{	
    		if (index == 0){
        		temp.setNext(head);
        		this.head = temp;
    		} 
			else{
        		for(int i = 1; i < index; i++){
            		curr = curr.getNext();
        		}
        		temp.setNext(curr.getNext());
        		curr.setNext(temp);
   	 		}
			this.size++;
		}
	}		
	
	public void Clear(){
		tail = new Node<T>(null, null);
		head = new Node<T>(null, tail);
		//CHANGE
		head.next = tail;
	
		this.size = 0;
		
	}
	
	public int size(){
		return this.size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}

	public boolean add(T x){
		insert( x, size());
		return true;
	};
	public void removeLast(){
		if(size == 0)
			throw new IllegalArgumentException("Nothing to remove");
		else
			remove(size);
	}

	public void remove(int index) {

    	Node curr = head;
		if(size == 0){
			throw new IllegalArgumentException("Nothing to remove");
		}
		else{
    		if (index == 0) {
        		head = head.getNext();
   	 		} 
			else {
        		for (int i = 1; i < index; i++){
            		curr = curr.getNext();
        		}

        	curr.setNext(curr.getNext().getNext());	
    		this.size--;
			}
		}
	}
	
	public Iterator<T> iterator() {
        return new SinglyLinkedListIterator();
    }

	private class SinglyLinkedListIterator implements Iterator<T>{
		private Node<T> current = head.next;
		private boolean okToRemove = false;

		public boolean hasNext()
		{
			return current != tail;
		}
	
		public T next()
		{
			if(!hasNext()){
				throw new java.util.NoSuchElementException( );
			}
			T nextItem = current.data;
    		current = current.next;
    		okToRemove = true;
    		return nextItem;
		}	
		public void remove( ){
			throw new UnsupportedOperationException("remove operation is not supported by this iterator");
		}
	}
	
	public T getNthFromFirst(int n){
		return getT(n);
	}

	public T getNthFromLast(int n){
		int fromhead = size - n;
		T target = getT(fromhead);
		return target;
	}
	

public String toString() {
    String list = "";
    list += "[" + this.head.getData() + "]";

    Node curr = head.getNext();
    while (curr != null){
        list += "[" + curr.getData() + "]";
        curr = curr.getNext();
    }

    return list;

	}
}
