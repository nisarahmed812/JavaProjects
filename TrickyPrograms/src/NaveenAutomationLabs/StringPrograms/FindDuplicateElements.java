package NaveenAutomationLabs.StringPrograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		String[] infra = { "Amazon", "GCP", "Azure", "Amazon", "Ali Baba", "Sauce Labs", "Azure", "GCP" };

		System.out.println("**********brute force**********");
		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i] == infra[j]) {
					System.out.println(infra[i]);
				}
			}
		}

		System.out.println("**********hash set**********");
		Set<String> data = new HashSet<String>();
		for (String e : infra) {
			if (data.add(e) == false) {
				System.out.println(e);
			}
		}

		System.out.println("**********streams**********");
		Set<String> data2 = new HashSet<String>();

		Set<String> dupSet = Arrays.asList(infra).stream().filter(e -> !data2.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
	}

}
