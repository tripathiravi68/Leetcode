public class InsertNumber {
    public static void main(String[] args) {
        int arr[]={9};
        plusOne(arr);

        }
    public static void plusOne(int[] digits) {
        int sum =0;

        for(int i =0 ;i<digits.length;i++)
        {
            sum+=digits[i]*Math.pow(10,digits.length-i-1);
            System.out.println("The digits are"+sum);

        }
        System.out.println("The sum before adding 1-"+sum);
        sum+=1;
        System.out.println("The sum after adding 1-"+sum);
        int arr[]=new int[digits.length];
        int i = digits.length;
        while(sum>0)
        {

            int num = sum%10;
            arr[--i] = num;
            sum =sum/10;
        }
        for(int j : arr)
        {
            System.out.print(j+" \n");
        }

    }
}
