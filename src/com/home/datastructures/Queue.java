package com.home.datastructures;

public interface Queue<E> extends Collection<E> {

	void push(E data) throws Exception;

	E pop() throws Exception;
}
