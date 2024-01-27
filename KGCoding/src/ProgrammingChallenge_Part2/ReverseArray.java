package ProgrammingChallenge_Part2;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numArr = {1, 2, 3, 4, 5};

        reverse(numArr);

        System.out.println("Your reversed array is:");
        displayArray(numArr);
    }

    public static void reverse(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length / 2; i++) {
            // Swap elements using a temporary variable
            int temp = arr[i];
            arr[i] = arr[length - 1 - i];
            arr[length - 1 - i] = temp;
        }
    }

    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

