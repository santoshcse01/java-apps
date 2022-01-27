package collections;

public class FindFirstNonRepeatChar {

    public static void main(String[] a) {
        String s = "sseedrffd";
        for (char i: s.toCharArray()) {
            if (s.indexOf(i) == s.lastIndexOf(i)) {
                System.out.println(i);
                break;
            }
        }
    }



}
