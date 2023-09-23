package NaveenAutomationLabs.IntegerPrograms;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		/*
		 * Print 1 to 100 without using any loop 
		 * 1= Recursive function/ Recursion
		 * 2= Java Streams
		 */
		
		printNum(1);
		printNumber(5, 50);

		//Using Stream
		IntStream.range(1, 101).forEach(s->System.out.println(s));
	}

	private static void printNum(int num) {
		if (num<=100) {
			System.out.println(num);
			num++;
			printNum(num);
		}	
	}
	
	private static void printNumber(int startNum, int endNum) {
		if (startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			printNumber(startNum, endNum);
		}	
	}

}
