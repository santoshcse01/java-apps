package strings;

public class MaxPalindrome {

    public static void main(String[] a) {
        String s = "ababadmadam";
        String max = "";
        for (int i=0;i<s.length();i++) {
            for (int j=s.length()-1;j>=i;j--) {
                String temp = check(s, i, j);
                if (temp.length() > max.length()) max = temp;
            }
        }
        System.out.println(max);
    }

    static String check(String s, int start, int end) {
        String temp1 = s.substring(start, end+1);
        String temp2 = new StringBuffer(temp1).reverse().toString();
        if (temp1.equals(temp2)) {
            return temp1;
        }
        return "";
    }

}
