package code_part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class part2 {
	public static void main(String[] args) {
		int collectionSize = 1000000;
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> vector = new Vector<>();
		int[] array = new int[collectionSize];
		for (int i = 0; i < collectionSize; i++) {
			int randomInt = (int) (Math.random()*10);
			arrayList.add(randomInt);
			vector.add(randomInt);
			array[i] = randomInt;
		}
		System.out.println("ArrayList summing time: "+sumElementsUsingIterator(arrayList)+" nanoseconds");
		System.out.println("Vector summing time: "+sumElementsUsingIterator(vector)+" nanoseconds");
		System.out.println("Array summing time: "+sumElementsUsingForLoop(array)+" nanoseconds");
	}
	private static long sumElementsUsingIterator(List<Integer> collection) {
		long start = System.nanoTime();
		int sum = 0;
		Iterator<Integer> iterator = collection.iterator();
		while (iterator.hasNext()) {
			sum += iterator.next();
		}
		long end = System.nanoTime();
		return end - start;
	}
	private static long sumElementsUsingForLoop(int[] array) {
		long start = System.nanoTime();
		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
		}
		long end = System.nanoTime();
		return end-start;
	}
}
