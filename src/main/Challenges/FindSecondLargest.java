class FindSecondLargest {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 1, 2, 3, 4 };
    int secondLargest = findSecondLargest(nums);

    System.out.println("second largest: " + secondLargest);
  }

  static int findSecondLargest(int[] arr) {
    if (arr.length < 2)
      return -1;

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for (int num : arr) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }
    }

    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
  }

}