package SDET;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamToArray {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numbersList); // [1, 2, 3, 4, 5]
		
		Object[] arr = numbersList.stream().toArray();
		System.out.println(arr); // [Ljava.lang.Object;@574caa3f

		for (Object a : arr) {
			System.out.println(a);
		}
	}

}
