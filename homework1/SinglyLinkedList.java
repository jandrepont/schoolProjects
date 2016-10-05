/*
 *
 * SinglyLinkedList that only keeps track of size and the head node
 * author @jandrepont
 * HW1 CSCI 2125 UNO Fall 2016
 *
 */ 





import java.util.*;
import java.lang.*;
import java.util.NoSuchElementException;
public class SinglyLinkedList<T> implements Iterable<T>
{

//instance variables
	private int size;
	private Node<T> head;
	//private Node<T> tail;
	
	public SinglyLinkedList(){
        this.head = head;
	//	this.tail = tail;
        this.size = 0;
	}	
	//need to get node to know the next node, 
	private static class Node<T>{
   
   		private T data;
   		private Node<T> next;
   	
   		public Node(T data, Node<T> n) {
    		this.data = data;
			this.next = n;
			
   		}
		
		//public Node(T data) {
        //	data = data;
		//	next = null;
		//}
	
	}

	/*
	* adds a node to the end of the list
	*/
	public void add(T x){
		if( head == null)
        	head = new Node<T>(x, head);
        else
        {
          	Node<T> temp = head;
          	while(temp.next != null){
				temp = temp.next;
			}
  			temp.next = new Node<T>(x, null);
        
     	}
	}

	/*
	* adds a node at the specified index
	*/	
	public void insert(T data, int index){
    	Node curr = head;
		if (index > size) {
        	throw new IllegalArgumentException("The index [" + index + "] is greater than the current size [" + size + "].");
    	}
		else{	
    		if (index == 0){
        		Node temp = new Node(data, curr);
				this.head = temp;
				this.size++;
    		} 
			else{
        		for(int i = 0; i < index; i++){
            		curr = curr.next;
        		}
        		curr = new Node(data , curr.next); 
        		//curr.setNext(temp);
				//tmp.next = new Node<AnyType>(item, null);
   	 		}
			this.size++;
		}
	}		
	
	/*
	* removes the 1st occurence of the given element from the list
	*/

	public void remove(T element) {
		System.out.println("remove called" );
    	Node<T> curr = head;
		Node<T> prev = null;
		if(head == null){
			throw new IllegalArgumentException("Nothing to remove");
		}
		else{
    		if (head.data == element) {
        		head = head.next;
				return;
   	 		}	 	
	 		while(curr != null && !(curr.data == element))
       		{
          		prev = curr;
          		curr = curr.next;
       		}
 			if(curr == null)
          		throw new RuntimeException("cannot delete");
 
       //delete cur node
       	}
		prev.next = curr.next;
	}
	/*
	* returns the data in the last node	
	*/	
	public T getLast()
   	{
    	if(head == null) 
			throw new NoSuchElementException();
 
        Node<T> curr = head;
        while(curr.next != null){
			curr = curr.next;
  		}
        return curr.data;
    }	

	/*
	* clears the Linked List
	*/
	public void clear(){
		head = null;
	}

	/*
	* returns true if the list is empty
	*/
	public boolean isEmpty(){
		return head == null;
	}

	/*
	* returns the number of elements in the linked list
	*/
	public int size(){
		return size;
	}

	
	/*
	* gets the nth element from the 1st node
	*/
	
	public T getNthFromFirst(int n){
		Node curr = head;
		for(int i = 0; i < n; i++){
			curr = curr.next;
		}
		return (T)curr.data;
	}
	/*
	* gets the nth element from the last node
	*/

	public T getNthFromLast(int n){
		int fromhead = size - n;
		Node curr = head;
		for(int i = 0; i < n; i++){
			curr = curr.next;
		}
		return (T)curr.data;
	}

		
	/*
	* Iterator and its methods
	*/

	public Iterator<T> iterator() {
    	return new SinglyLinkedListIterator();
    }

	private class SinglyLinkedListIterator implements Iterator<T>{
		private Node<T> nextNode;
		private boolean okToRemove = false;
		
		public SinglyLinkedListIterator(){
			nextNode = head;
		}
		public boolean hasNext()
		{
			return nextNode != null;
		}
	
		public T next()
		{
			if(!hasNext()){
				throw new java.util.NoSuchElementException( );
			}
			T nextItem = nextNode.data;
    		nextNode = nextNode.next;
    		okToRemove = true;
    		return nextItem;
		}	
		public void remove( ){
			throw new UnsupportedOperationException("remove operation is not supported by this iterator");
		}
	}
	/*
	* toString method, printing out all that stuffs
	*/
	public String toString() {
    	String list = "";
    	list += "[" + this.head.next + "]";

    	Node curr = head.next;
    	while (curr != null){
        	list += "[" + curr.data + "]";
        	curr = curr.next;
    	}

    	return list;

	}
}
