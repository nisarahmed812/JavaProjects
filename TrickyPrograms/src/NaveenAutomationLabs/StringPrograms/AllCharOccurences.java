package NaveenAutomationLabs.StringPrograms;

import java.util.HashMap;
import java.util.Map;

public class AllCharOccurences {

	public static void main(String[] args) {

		String name = "test";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : name.toCharArray()) {
			if (c != ' ') { // Check if the character is not a space
				if (charMap.containsKey(c)) {
					charMap.put(c, charMap.get(c) + 1);
				} else {
					charMap.put(c, 1);
				}

			}

		}
		System.out.println(name + ":" + charMap);
	}
}
