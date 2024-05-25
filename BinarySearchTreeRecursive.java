public class BinarySearchTreeRecursive {

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 12, 24};
        System.out.println("The returned index is " + binarySearcht(arr,  arr.length -1,0, 8));
    }

    public static int binarySearcht(int arr[], int high, int low, int key) {
        if(low > high)
        {
            return low;
        }
        int middle = (low + high) / 2;
        if (arr[middle] == key) {
            return middle;
        } else if (arr[middle] < key) {
            return binarySearcht(arr, high, middle + 1, key);
        }
        return binarySearcht(arr, middle - 1, low, key);
    }
}




//Recursive Approach