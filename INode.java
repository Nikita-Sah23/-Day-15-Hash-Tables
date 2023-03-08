package com.linkedList;

public interface INode<K> {

	 public K getKey();
	    void setKey(K key);
	    void setNext(INode next);
	    INode getNext();
}
