package JavaMiscellaneous;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStream {

	public static void main(String[] args) {
		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };

		IntStream intStream = Arrays.stream(a);
		intStream.forEach(x -> System.out.println(x));

		String[] stringArray = { "apple", "banana", "cherry", "date" };

		Stream<String> stringStream = Arrays.stream(stringArray);
		stringStream.forEach(s -> System.out.println(s));
	}

}
