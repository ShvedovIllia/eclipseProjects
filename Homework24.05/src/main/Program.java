package main;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		Set<Animal> animals = new LinkedHashSet<>();
		
		animals.add(new Animal ("Sasha", Type.MONKEY, 25));
		animals.add(new Animal ("Sasha", Type.CAT, 23));
		animals.add(new Animal ("Sasha", Type.DOG, 24));
		
		System.out.println(animals);
		
		Set<Animal> animals1 = new TreeSet<>();
		
		animals1.add(new Animal ("Sasha", Type.MONKEY, 25));
		animals1.add(new Animal ("Sasha", Type.CAT, 22));
		animals1.add(new Animal ("Sasha", Type.DOG, 27));
		
		System.out.println(animals1);
		
		Set<Animal> animals2 = new TreeSet<>(new AnimalComparatorByAge().reversed());
		
		animals2.add(new Animal ("Sasha", Type.MONKEY, 25));
		animals2.add(new Animal ("Sasha", Type.CAT, 22));
		animals2.add(new Animal ("Sasha", Type.DOG, 27));
		
		System.out.println(animals2);
		
		
	}

}
