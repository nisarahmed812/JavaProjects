package NaveenAutomationLabs.IntegerPrograms;

import java.util.BitSet;

public class PrintNumbers {

	public static void main(String[] args) {
		/*
		 * Print from 1 to 100 without using loop and recursion
		 */

		BitSet bitSet = new BitSet();
		bitSet.set(1, 101);
		System.out.println(bitSet);
	}

}
