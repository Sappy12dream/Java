public class RotateArrayByN {
  public static void main(String[] args) {

    System.out.print("Hello World");
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 3;
    rotate(arr, k);

    for (int num : arr) {
      System.out.println(num);
    }

  }

  public static void rotate(int[] array, int k) {
    int n = array.length;
    k = k % n; // handle k > n

    // Step 1: Reverse entire array
    reverseArray(array, 0, n - 1);

    // Step 2: Reverse first k elements
    reverseArray(array, 0, k - 1);

    // Step 3: Reverse remaining n-k elements
    reverseArray(array, k, n - 1);
  }

  public static void reverseArray(int[] array, int start, int end) {

    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }

  }
}