package main;

import java.io.Serializable;

public class Container <T extends Comparable & Serializable> {
	
	private T val;
	private Container<T> next;
	public Container(T val) {
		this.val = val;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	public Container<T> getNext() {
		return next;
	}
	public void setNext(Container<T> next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "Container [val=" + val + ", next=" + next + "]";
	}
	
	
	
	
	

}
