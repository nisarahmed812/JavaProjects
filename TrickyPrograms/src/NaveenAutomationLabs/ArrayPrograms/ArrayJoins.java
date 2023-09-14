package NaveenAutomationLabs.ArrayPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

import com.google.common.collect.ObjectArrays;
import com.google.common.primitives.Ints;

public class ArrayJoins {

	public static void main(String[] args) {
		// join two arrays using Java 8 or Google Guava Library

		// Concatenate two arrays using Java 8
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "8" };

		// Concatenate two arrays using Java 8 streams
		String[] result = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[]::new);

		// Print the joined array
		System.out.println(Arrays.toString(result));

		// Concatenate two arrays using Google Guava
		String[] result2 = ObjectArrays.concat(array1, array2, String.class);

		// Print the joined array
		System.out.println(Arrays.toString(result2));

		// for primitive types arrays
		int[] p1 = { 1, 2, 3, 4, 5 };
		int[] p2 = { 6, 7, 8, 9, 10 };

		int[] p3 = Ints.concat(p1, p2);
		System.out.println(Arrays.toString(p3));
	}

}
