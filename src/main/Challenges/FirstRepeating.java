import java.util.HashMap;

class FirstRepeating {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 2, 1 };
    int firstRepeat = firstRepeating(nums);
    System.out.println("first repeating number: " + firstRepeat);
  }

  static int firstRepeating(int[] arr) {
    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

    // First pass: count frequencies
    for (int num : arr) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    // Second pass: find first repeating
    for (int num : arr) {
      if (freq.get(num) > 1)
        return num;
    }

    return -1;
  }
}
