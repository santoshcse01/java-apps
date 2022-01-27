package collections;

public class FindPairOfNumEqToK {

    public static void main(String []a) {
        int s[] = {3,5,6,1,5};
        int k = 7;
        //Arrays.sort(s); // 1, 3, 5, 5, 6

        int j = s.length-1;
        for (int i=0;i<s.length && j>0;) {
            if (s[i]+s[j] == k) {
                System.out.println(s[i]+" "+s[j]);
                break;
            }
            else if (s[i]+s[j] < k) {
                i++;
                continue;
            } else {
                j--;
            }
        }
    }

}
