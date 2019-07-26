package main;

import java.lang.reflect.Field;

public class Analizer {

	public static void analize(Object o) throws Exception {
		Class<?> cls = o.getClass();
		
		for (Field f : cls.getDeclaredFields()) {
			if (f.isAnnotationPresent(Random.class)) {
				Random r = f.getAnnotation(Random.class);
				int num = num(r.min(), r.max());
				
				if(!f.isAccessible()) {
					f.setAccessible(true);
					f.set(o, num);
					f.setAccessible(false);
				}else {
					f.set(o, num);
				}
			}
		}
		
	}
	
	private static int num(int min, int max) {
		return min + new java.util.Random().nextInt(max - min);
	}
}
