
class MaxSubarraySum {
  public static void main(String[] args) {
    int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int isZeroSum = maxSubarraySum(nums);
    System.out.println("maximum sum: " + isZeroSum);
  }
  static int maxSubarraySum(int[] arr) {
    int maxSoFar =arr[0];
    int currentSum=arr[0];
    for (int i = 1; i < arr.length; i++){
      currentSum=Math.max(arr[i],currentSum+arr[i]);
      maxSoFar=Math.max(maxSoFar,currentSum);
    }
    return maxSoFar;
  }
}
