public class RemoveDuplicateString {

    public static void main(String[] args) {
        String s = "AABBBCDDDEFFHIIJKLMNNOOPPQQRSTUVVWXYZZZZ";
        System.out.println("The String after the removal of duplicates are :" + removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        char c[] = s.toCharArray();
        char arr[]=new char[s.length()];
        System.out.println(c[0]);
        arr[0]=c[0];
        int j = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == (c[i - 1])) {
                if (arr[j] == c[i]) {

                } else {
                    arr[++j] = c[i];
                }

            } else {

                arr[++j] = c[i];
            }

        }

        return new String (arr).substring(0,j+1);
    }
}
