public class CountEven {
  public static int countEvens(int[] array) {
    int count = 0;
    for (int num : array) {
      if (num % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}