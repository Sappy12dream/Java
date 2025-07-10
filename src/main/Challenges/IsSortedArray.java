public class IsSortedArray {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 1, 2, 3, 4, 5 };
    boolean isSortedArray = isSorted(nums);
    System.out.println("is sorted: " + isSortedArray);
  }

  static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < arr[i - 1]) {
        return false;
      }
    }
    return true;
  }

}