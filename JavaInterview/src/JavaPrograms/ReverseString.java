package JavaPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// reverse the string without using Predefined reverse methods or Palindrome Verification
		// verify if string is Palindrome or not
		// Palindrome means string is same in both forward/reverse order like madam

		String s = "madam";
		String t = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			t = t + s.charAt(i);
		}
		System.out.println(t);
		
		if(s.equals(t)) {
			System.out.println("String is Palindrome");
		}
	}

}
