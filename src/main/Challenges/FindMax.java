public class FindMax {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 1, 2, 3, 4, 5 };
    int max = findMax(nums);
    System.out.println("max: " + max);
  }

  static int findMax(int[] arr) {
    int max = arr[0];
    for (int num : arr) {
      if (max < num) {
        max = num;
      }

    }
    return max;

  }

}