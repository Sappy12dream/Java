public class RemoveElement {
  public static void main(String[] args) {
    int[] arr = { 0, 3, 0, 3, 12 };
    int elem = 3;
    int newLength = removeElement(arr, elem);

    System.out.println("New length: " + newLength);
    System.out.print("Modified array: ");
    for (int i = 0; i < newLength; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static int removeElement(int[] array, int elem) {
    int i = 0;

    for (int j = 0; j < array.length; j++) {
      if (array[j] != elem) {
        array[i++] = array[j];
      }
    }
    return i;
  }
}