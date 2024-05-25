public class InsertPosition1 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6};
        System.out.println("The returned index is " + insertPosition(arr, 4));
    }

    private static int insertPosition(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            } else if (arr[i] > num) {
                return i;
            }

        }
        return arr.length;
    }
}

// bit more refined version of the previous solution but both will take o(n)