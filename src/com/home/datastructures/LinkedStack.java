package com.home.datastructures;

public class LinkedStack<E> implements Stack<E> {

	// Stores the element at the top of stack
	private Node<E> top;

	// Stores the current size of stack
	private int size;

	// Max. capacity of the stack
	private final int capacity;

	// Default capacity
	private static final int DEFAULT_CAPACITY = 10;

	/**
	 * Default non-parameterized construction
	 */
	public LinkedStack() {
		// Instantiating stack with default capacity
		this(DEFAULT_CAPACITY);
	}

	/**
	 * Constructor using capacity
	 * 
	 * @param capacity
	 *            User defined <code>int</code> capacity
	 */
	public LinkedStack(int capacity) {
		// Throws an exception if capacity is less than 1
		if (capacity < 1) {
			throw new IllegalArgumentException(
					"capacity should be greater than 1");
		}

		// Setting the capacity
		this.capacity = capacity;
	}

	private class Node<E> {
		// Stores the object data
		private E data;

		// Points to the previous node in the stack.
		// null if this is the last node.
		private Node<E> previous;

		public Node(E data, Node<E> previous) {
			this.data = data;
			this.previous = previous;
		}

		public E getData() {
			return data;
		}

		public Node<E> getPrevious() {
			return previous;
		}
	}

	public boolean isEmpty() {
		return (size < 1);
	}

	public int size() {
		return size;
	}

	public int capacity() {
		return capacity;
	}

	public void push(E data) throws Exception {
		// Checking stack overflow condition
		if (size == capacity) {
			throw new Exception("Stack overflow exception");
		}

		// This will automatically handle the case even when (top == null), i.e.
		// adding the first element of the stack
		Node<E> newNode = new Node<E>(data, top);
		top = newNode;

		// Increment the size
		size++;
	}

	public E pop() throws Exception {
		// Checking the stack underflow condition
		if (isEmpty()) {
			throw new Exception("Stack underflow exception.");
		}

		E data = top.getData();
		// If the size was = 1 then now, top = null
		top = top.getPrevious();

		// Decrement the size
		size--;

		return data;
	}
}
