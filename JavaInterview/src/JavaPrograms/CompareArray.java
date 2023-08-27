package JavaPrograms;
import java.util.ArrayList;

public class CompareArray {

	public static void main(String[] args) {
		// compare same indexes of two different arrays and create another array for
		// matching values
		int a[] = { 1, 4, 5, 7 };
		int b[] = { 6, 4, 3, 7 }; // {4,7}

		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				al.add(a[i]);
			}
		}
		Object[] c = al.toArray();
		for (Object obj : c) {
			System.out.println(obj);
		}

	}

}
