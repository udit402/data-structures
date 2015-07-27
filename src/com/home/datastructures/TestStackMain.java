package com.home.datastructures;

public class TestStackMain {

	public static void main(String[] args) throws Exception {
		// Perform the operations on a stack
		testStack();
	}

	private static void testStack() throws Exception {
		// throws java.lang.IllegalArgumentException:
		// capacity should be greater than 1
		// Stack stack = new Stack(0);

		// Instantiating the stack
		Stack stack = new Stack(5);

		System.out.println("----------------------------------------------");
		System.out.println("After instantiation:");
		System.out.println("stack.capacity()= " + stack.capacity());
		System.out.println("stack.size()= " + stack.size());
		System.out.println("stack.isEmpty()= " + stack.isEmpty());

		// Inserting elements into stack:
		int capacity = stack.capacity();
		for (int i = 1; i <= capacity; i++) {
			stack.push(i);
		}

		// throws Stack overflow exception
		// stack.push(6);

		// Stack after insertions
		System.out.println("----------------------------------------------");
		System.out.println("After insertions:");
		System.out.println("stack.capacity()= " + stack.capacity());
		System.out.println("stack.size()= " + stack.size());
		System.out.println("stack.isEmpty()= " + stack.isEmpty());

		// Starting data extraction:
		System.out.println("----------------------------------------------");
		System.out.println("Starting data extraction:");
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			System.out.println("stack.pop()= " + stack.pop());
		}
		// throws Stack underflow exception
		// System.out.println("stack.pop()= " + stack.pop());

		// After data extraction:
		System.out.println("----------------------------------------------");
		System.out.println("After data extraction:");
		System.out.println("stack.capacity()= " + stack.capacity());
		System.out.println("stack.size()= " + stack.size());
		System.out.println("stack.isEmpty()= " + stack.isEmpty());

		System.out.println("----------------------------------------------");
	}

}
