package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStream {

	public static void main(String[] args) {
		// Concatenate two lists using stream
		List<String> list1 = Arrays.asList("Dog", "Cat");
		List<String> list2 = Arrays.asList("parrot", "crow");

		List<String> concatenatedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		System.out.println(concatenatedList);

		// Concatenate two arrays using stream
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "8" };

		String[] concatenatedArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[]::new);
		System.out.println(Arrays.toString(concatenatedArray));
	}

}
