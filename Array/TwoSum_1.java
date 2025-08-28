public class TwoSum_1 {
    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 10;

        int result[] = twoSum(arr, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
