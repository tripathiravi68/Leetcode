public class RemoveDuplicateString1 {

    public static void main(String[] args) {
        String s = "AABBBCDDDEFFGGGGHIIJKLMNNOOPPQQRSTUVVWXYZZZZ";
        System.out.println("The String after the removal of duplicates are :" + removeDuplicates(s));
    }

    public static String removeDuplicates(String s) {
        char c[] = s.toCharArray();
        char previous = ' ';
        int k = 0;
        for (char a : c) {
            if (previous != a) {
                c[k++] = a;
                previous = a;
            }
        }
        return new String(c).substring(0, k);

    }
}

/*to convert character array to string : new String (char arr);
The given character can be passed into the String constructor.
 By default, the character array contents are copied using the Arrays.copyOf() method present in the Arrays class.
 // using the valueOf() method
    public static String toString(char[] a)
    {
        // Creating an object of String class
        String string = String.valueOf(a);

        return string;
    }
 ...
  StringBuilder sb = new StringBuilder();

        // Creating a string using append() method
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }

        return sb.toString();
    }
.....
      // Storing it in a string
        // using copyValueOf() over string
        String str = String.copyValueOf(arr);
 */