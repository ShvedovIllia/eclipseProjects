package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws Exception {
		Class<?> clz = Person.class;
//		
//		Person person = new Person ("Anton", 28, "male");
//		Class<?> clazz = person.getClass();
		
//		System.out.println(clazz.getName());
		
//		for (Field field : clazz.getFields()) {
//			System.out.println(field);
//		}
//		
//		System.out.println();
//		
//		for (Field field : clazz.getDeclaredFields()) {
//			System.out.println(field);
//		}
//		
//		for (Field field : clazz.getDeclaredFields()) {
//		field.setAccessible(true);
//		System.out.println(field.get(person));
//		if(!field.isAccessible()) {
//			field.setAccessible(true);
//			System.out.println(field.get(person));
//			field.setAccessible(false);
//		}else {
//			System.out.println(field.get(person));
//		}
		
		
//      }
		
//		
//		Field f = clz.getDeclaredField("gender");
//		f.setAccessible(true);
//		f.set(person, "GENDER");
//		
//		System.out.println(person);
//	
//		Scanner sc = new Scanner(System.in);
//		Class<?> c1 = Class.forName(sc.next());
//		
//		Object instance = c1.newInstance();
//		
//		System.out.println(instance);
//		
//		Person p = (Person) copy(person);
//		p.gender = "AAA";
//		System.out.println(person);
//		
//		System.out.println(p);
//		
//		Person p1 = new Person();
//		Analizer.analize(p1);
//		System.out.println(p1);	
		
		Constructor<?> c = clz.getConstructor(String.class, int.class, String.class);
		
		Object inst = c.newInstance("Petro", 28, "male");
		System.out.println(inst);
	}
	
	public static Object copy(Object o) throws Exception{
		
		Class<?> cls = o.getClass();
		Object copy = cls.newInstance();
		for (Field f : cls.getDeclaredFields())
			if(!f.isAccessible()) {
				f.setAccessible(true);
				System.out.println(f.get(o));
				f.setAccessible(false);
			}else {
				f.set(copy, f.get(o));
			}
		
		return o;
		
	}
}
