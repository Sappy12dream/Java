public class RightRotateByKPosition {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 1, 2, 3, 4 };
    int k = 1;
    rightRotateByPosition(nums, k);
    for (int num : nums)
      System.out.println(num);
  }

  static void rightRotateByPosition(int[] arr, int k) {
    int n = arr.length;
    k = k % n; // important to handle k > n
    reverse(arr, n - k, n - 1);
    reverse(arr, 0, n - k - 1);
    reverse(arr, 0, n - 1);

  }

  static void reverse(int[] arr, int left, int right) {
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }

}