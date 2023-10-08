package SDET;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String

		String str = "ABCD";
		String rev = "";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);

		String str2 = "ABCD";
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer revSb = sb.reverse();
		System.out.println(revSb);
	}

}
