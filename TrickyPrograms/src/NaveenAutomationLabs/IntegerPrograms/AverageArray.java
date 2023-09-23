package NaveenAutomationLabs.IntegerPrograms;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.google.common.math.DoubleMath;

public class AverageArray {

	public static void main(String[] args) {
		// calculate average of array using
		// total sum divide by array length is average

		// simple loop
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		double sum = 0;
		for (int e : num) {
			sum = sum + e;
		}
		System.out.println("Total= " + sum);
		System.out.println("Avg= " + sum / num.length);

		// streams
		OptionalDouble avg = Arrays.stream(num).average();
		System.out.println(avg.getAsDouble());

		// guava
		double avg1 = DoubleMath.mean(num);
		System.out.println(avg1);
	}

}
