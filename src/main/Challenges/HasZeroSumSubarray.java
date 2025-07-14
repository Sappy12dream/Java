import java.util.HashSet;

class HasZeroSumSubarray {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    boolean isZeroSum = hasZeroSumSubarray(nums);
    System.out.println("zero sum: " + isZeroSum);
  }

  static boolean hasZeroSumSubarray(int[] arr) {
    HashSet<Integer> freq = new HashSet<Integer>();
    int sum = 0;
    for (int num : arr) {
      sum += num;
      if (num == 0 || sum == 0 || freq.contains(sum)) {
        return true;
      }
      freq.add(sum);
    }

    return false;
  }
}
