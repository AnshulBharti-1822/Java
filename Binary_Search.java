public class Binary_Search {

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 100};
        int n = 40;
        java.util.Arrays.sort(arr);

        int index = binarysearch(arr, 0, arr.length - 1, n);
        System.out.println("Element found at index " + index);
    }

    private static int binarysearch(int[] arr, int low, int high, int n) {
        while (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == n) {
                return mid;
            }

            if (n < arr[mid]) {
                high = mid - 1;  
            } else {
                low = mid + 1;  
            }
        }

        return -1;  
    }
}
