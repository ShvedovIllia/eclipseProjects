package main;

import java.lang.reflect.Field;

public class Program {

	public static void main(String[] args) throws Exception {
//		Animal a = new Animal ("Cat", 2, "Illia1");
//		Animal d = new Animal ("Dog", 5, "Illia2");
//		
//		System.out.println(a);
//		System.out.println(d);
//		
//		Class <?> cls = a.getClass();
//		System.out.println(cls.getSimpleName().toUpperCase());
//		
//		for (Field f : cls.getFields()) {
//			System.out.println(f);
//		}
//		
//		for (Field f : cls.getDeclaredFields()) {
//			System.out.println(f);
//		}
//		for (Field field : cls.getDeclaredFields()) {
//			field.setAccessible(true);
////			System.out.println(field.get(a));
//			if(!field.isAccessible()) {
//				field.setAccessible(true);
//				System.out.println(field.get(a));
//				field.setAccessible(false);
//			}else {
//				System.out.println(field.get(a));
//			}
//		}
		
		Animal a = Animal.con("Dog", 5, "Illia2");
		System.out.println(a);
		
		
		
		
	}

}
