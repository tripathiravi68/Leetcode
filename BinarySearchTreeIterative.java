public class BinarySearchTreeIterative {

    public static void main(String[] args) {
        int arr[] = {3,5,7,12, 24};
       System.out.println("The returned index is "+ binarySearcht(arr,12));
    }

    public static int binarySearcht(int arr[], int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

//Iterative Approach