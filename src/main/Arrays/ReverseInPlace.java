public class ReverseInPlace {
  public static void main(String[] args) {
    int[] testArray = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] result = reverseInPlace(testArray);

    for (int num : result) {
      System.out.println(num);
    }
  }

  public static int[] reverseInPlace(int[] array) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {

      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;

      left++;
      right--;

    }
    return array;
  }

}