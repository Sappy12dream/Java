class FindMissingNumber {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 3, 0, 1 };
    int missingNum = findMissingNumber(nums);

    System.out.println("missing number: " + missingNum);
  }

  static int findMissingNumber(int[] arr) {
    int n = arr.length;
    int totalSum = n * (n + 1) / 2;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    return totalSum - sum;

  }

}
