public class MoveZeros {
  public static void main(String[] args) {
    int[] arr = { 0, 1, 0, 3, 12 };
    int totalMoved = moveZeroes(arr);

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println("total moved: " + totalMoved);
  }

  public static int moveZeroes(int[] array) {
    int i = 0;
    int totalMoved = 0;

    for (int num : array) {
      if (num != 0) {
        array[i++] = num;
      }
    }
    while (i < array.length) {
      array[i++] = 0;
      totalMoved++;
    }
    return totalMoved;
  }
}