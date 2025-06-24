// Operation	Time Complexity
// Access (by index)	O(1)
// Update (by index)	O(1)
// Search (linear)	O(n)
// Insert at end (if space)	O(1)
// Insert at middle/start	O(n) (shift!)
// Delete at middle/start	O(n) (shift!)

// Limitations:
// Size is fixed — can't dynamically resize (use ArrayList if needed).

// Inserting/removing at the beginning/middle is costly (shifting).

public class ReverseArray {
  public static void main(String[] args) {

    int[] array = { 1, 7, 8, 9, 10 };

    int[] result = reverseArray(array);
    for (int num : result)
      System.out.println(num);

  }

  public static int[] reverseArray(int[] array) {
    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      result[i] = array[array.length - 1 - i];
    }
    return result;

  }
}