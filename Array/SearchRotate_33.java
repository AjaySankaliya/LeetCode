public class SearchRotate_33 {
    public static void main(String[] args) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };

        int fun = search(arr, 9);

        if (fun != -1) {
            System.out.println("Element found at position:" + fun);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int search(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
