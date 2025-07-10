class MoveZeroToEnd {
  public static void main(String[] args) {
    System.out.println("Hello World");
    int[] nums = {0, 1, 0, 3, 12};
     moveZerosToEnd(nums);
    for (int num : nums)
      System.out.println(num);
  }

  static void moveZerosToEnd(int[] arr) {
    int pos = 0;
    for(int num: arr){
      if(num != 0){
        arr[pos]=num;
        pos++;
      }
    }
    while (pos < arr.length){
      arr[pos]=0;
      pos++;
    }

  }

}