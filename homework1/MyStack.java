/*
*
* Stack implementation using a SinglyLinkedList
* author @jandrepont
* HW1 CSCI 2125 UNO Fall 2016
*
*/

class MyStack<T> {
	
    private final SinglyLinkedList<T> List = new SinglyLinkedList<T>();
	//adds data to the last node of the Linked List
    public void push(T data) {
        List.add(data);
    }
		
	//pop method uses removes the last node from the SinglyLinkedList
    public T pop() {
		System.out.println("pop function called on stack");
		T popped = List.getLast();	
		System.out.println(popped + " was popped from the stack");
		List.remove(popped);
		return popped;
	}
	//peek() returns the last item on the stack/Linked List
	public T peek(){
		T peek = List.getLast();
		return peek;
	}
	//uses iterator to see if the next value is not null
    public boolean isEmpty() {
        return !(List.iterator().hasNext());
    }
	//toString for printing out contents of the stack
    @Override
    public String toString() {
        return List.toString();
    }
}
