package main;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		
//		Container<String> c1 = new Container<>("One");
//		c1.setNext(new Container <String> ("Two"));
//		c1.getNext().setNext(new Container<String>("Three"));
//		
//		System.out.println(c1.getNext().getNext().getVal());
		
		List <? extends Number> aa = Arrays.asList(4, 15, 15 ,12);
//		aa.add(null);
//		System.out.println(aa.get(3));
		List<Integer> ab = Arrays.asList(34, 523, 235);
//		System.out.println(ab.get(2));
//		
//		System.out.println(sum(aa));
//		System.out.println(sum(ab));
//		
//		List <Integer> cc = new ArrayList<>(ab);
//		fill(cc, 8);
//		System.out.println(cc);
		
//		List<Object> ac = new ArrayList<Object>();
//		
//		
//		copy(aa,ac);
//		System.out.println(ac);
//	}
	
	public static <E> void fill(Collection<? super E> col, E el) {
		int len = col.size();
		col.clear();
		for(int i =0; i<len; i++) {
		col.add(el);
		}
	}
//	
//	public static <E> void copy(Collection<? extends Object> col1, Collection<? extends Object> col2) {
//		int len1 = col1.size();
//		int len2 = len1;
//		for(Object o : col1) {
//		}
		
		
		
		
	}
	
	public static Double sum(Collection<? extends Number> col) {
		double sum = 0;
		for (Number n : col) {
			sum+=n.doubleValue();
		}
		return sum;
	}
}
