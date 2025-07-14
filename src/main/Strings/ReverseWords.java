
class ReverseWords {
  public static void main(String[] args) {
    String input = "Hello World from Java";
    String output = reverseWords(input);
    System.out.println("reversed string: " + output);
  }

  public static String reverseWords(String s) {
    // your code
    String[] words = s.split(" ");
    StringBuilder reversed = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
      reversed.append(words[words.length - 1 - i]);
      reversed.append(" ");
    }
    return reversed.toString();
  }
}
