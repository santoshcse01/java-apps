package collections;

import org.springframework.util.StringUtils;

public class MakeSecondCharCapital {

    public static void main(String[] a) {
        String s = "wedfgs";
        String s1[] = s.split("");
        for(int i=1; i<s1.length; i=i+2) {
            s1[i] = s1[i].toUpperCase();
        }
        System.out.println(StringUtils.arrayToDelimitedString(s1, ""));
    }

}
