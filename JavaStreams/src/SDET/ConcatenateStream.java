package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatenateStream {

	public static void main(String[] args) {
		// Concatenate two lists using stream
		List<String> animalsList = Arrays.asList("Dog", "Cat");
		List<String> birdsList = Arrays.asList("parrot", "crow");

		List<String> combineList = Stream.concat(animalsList.stream(), birdsList.stream()).collect(Collectors.toList());
		System.out.println(combineList);

		// Concatenate two arrays using stream
		String[] array1 = { "Hello", "World" };
		String[] array2 = { "Java", "8" };

		String[] combineArray = Stream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray(String[]::new);
		System.out.println(Arrays.toString(combineArray));
	}

}
