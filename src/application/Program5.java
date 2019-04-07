package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program5 {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		Set<Integer> c = new TreeSet<>(a);

		// Union
		c.addAll(b);
		System.out.println(c);

		// Intersection
		Set<Integer> d = new TreeSet<>(a);

		d.retainAll(b);
		System.out.println(d);

		// Subtraction
		Set<Integer> e = new TreeSet<>(a);

		e.removeAll(b);
		System.out.println(e);

	}

}