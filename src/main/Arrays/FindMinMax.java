public class MinMax {
  public static void main(String[] args) {

    System.out.print("Hello World");
    int[] arr = { 5, 3, 8, 6, 2 };
    System.out.println(findMinMax(arr));

  }

  public static String findMinMax(int[] array) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int num : array) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num != largest) {
        secondLargest = num;
      }

    }
    if (secondLargest == Integer.MIN_VALUE)
      return "There is no second largest number in the array.";
    return "The largest number is " + largest + " and the second largest number is " + secondLargest;
  }

}