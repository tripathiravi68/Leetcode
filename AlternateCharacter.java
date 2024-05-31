
public class AlternateCharacter {

    public static String mergeAlternately(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();
        String arr = "";

        int min = len1 > len2 ? len2 : len1;
        for (int i = 0; i < min; i++) {
            arr += word1.charAt(i) + "" + word2.charAt(i);
            System.out.println("The arr is "+arr);

        }

        if (len1 > len2)
            arr = arr + "" + word1.substring(min, len1);
        else
            arr = arr + "" + word2.substring(min, len2);

        return arr;
    }

    public static void main(String[] args) {
        String word1="Mon";
        String word2="pqrstuv";
        System.out.println(mergeAlternately(word1,word2));
    }
}
