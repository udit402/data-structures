package com.home.datastructures;

public class LinkedQueue<E> implements Queue<E> {

	private Node<E> tail;

	private Node<E> head;

	private int size;

	private int capacity;

	private class Node<E> {
		private E data;

		private Node<E> next;

		public Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public Node<E> getNext() {
			return next;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void push(E data) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E pop() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
