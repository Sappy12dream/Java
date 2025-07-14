import java.util.HashSet;

class LongestConsecutive {
  public static void main(String[] args) {
    int[] nums = { 100, 4, 200, 1, 3, 2 };
    int consecutive = longestConsecutive(nums);
    System.out.println("consecutive: " + consecutive);
  }

  static int longestConsecutive(int[] arr) {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int num : arr) {
      set.add(num);
    }

    int maxLen = 0;

    for (int num : arr) {
      if (!set.contains(num - 1)) {
        int current = num;
        int count = 1;

        while (set.contains(current + 1)) {
          current++;
          count++;
        }

        maxLen = Math.max(maxLen, count);
      }
    }

    return maxLen;
  }
}
