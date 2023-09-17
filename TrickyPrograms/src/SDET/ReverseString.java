package SDET;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a String

		String str = "ABCD";
		String rev = "";

		char[] a = str.toCharArray();
		int len = a.length;

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println(rev);

		String str2 = "ABCD";
		StringBuffer sb = new StringBuffer(str2);
		StringBuffer revSb = sb.reverse();
		System.out.println(revSb);
	}

}
