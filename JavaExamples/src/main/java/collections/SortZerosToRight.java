package collections;

public class SortZerosToRight {

    public static void main(String []a) {
        String s = "00001111000111";
        int cnt = 0;
        String s1 = "";
        String s2 = "";
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '0') {
                s2 += "0";
            } else {
                s1 += s.charAt(i);
            }
        }
        System.out.println(s1+s2);
    }

}
