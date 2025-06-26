public class WordReverser {

  public static void main(String[] args) {
    char[] input = "the sky is red".toCharArray();
    reverseWords(input);
    System.out.println(new String(input));
  }

  public static void reverseWords(char[] sentence) {
    // Step 1: reverse entire array
    reverse(sentence, 0, sentence.length - 1);
    // Step 2: reverse each word in-place
    int start = 0;
    for (int end = 0; end <= sentence.length; end++) {
      if (end == sentence.length || sentence[end] == ' ') {
        reverse(sentence, start, end - 1);
        start = end + 1;
      }
    }
  }

  private static void reverse(char[] arr, int left, int right) {
    while (left < right) {
      char temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
    }
  }
}
