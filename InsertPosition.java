public class InsertPosition {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
      System.out.println("The returned index is "+insertPos(arr,7));
    }

    private static int  insertPos(int[] arr, int num) {
        for(int i =0; i < arr.length;i++)
        {
            if(arr[i]==num)
            {
                return i;
            }
        }
        for(int i =0; i < arr.length;i++)
        {
            if(arr[i]> num)
            {
                return i;
            }
        }
        return arr.length;
    }
}
