public class SumOdd {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = { 1, 2, 3, 4, 5 };
    int sum = sumOdd(nums);
    System.out.println("odd sum: " + sum);
  }

  static int sumOdd(int[] array) {
    int sum = 0;
    for (int num : array) {
      if (num % 2 != 0) {
        sum += num;
      }

    }
    return sum;

  }

}