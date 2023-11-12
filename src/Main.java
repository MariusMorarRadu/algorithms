public class Main {
    public static void main(String[] args) {

        int[] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPairs(nums, target);

        int[] nums2 = {2, 7, 4, 0, 9, 5, 1, 3};
        int target2 = 6;
        findTriplets(nums2, target2);


        int[] arr = {2, 7, 4, 0, 9, 5, 1, 3};
        int sum = 6;
        findTriplets(arr, sum);
    }


    private static void findPairs(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Pair: [" + nums[i] + ", " + nums[j] + "]");
                }
            }
        }
    }


    private static void findTriplets(int[] arr, int sum) {
        int len = arr.length;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (arr[i] + arr[j] + arr[k] == sum) {
                        System.out.println("Triplet: [" + arr[i] + ", " + arr[j] + ", " + arr[k] + "]");
                    }
                }
            }
        }
    }
}