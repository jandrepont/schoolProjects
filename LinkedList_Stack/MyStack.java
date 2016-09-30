class MyStack<T> {

    private final SinglyLinkedList<T> List = new SinglyLinkedList<T>();

    public void push(T data) {
        List.add(data);
    }

    public T pop() {
		System.out.println("pop function called on stack");
		T popped = List.getT(List.size());
		List.removeLast();	
		System.out.println(popped + " was popped from the stack");
		return popped;
	}



    public boolean isEmpty() {
        return !(List.iterator().hasNext());
    }

    @Override
    public String toString() {
        return List.toString();
    }
}
