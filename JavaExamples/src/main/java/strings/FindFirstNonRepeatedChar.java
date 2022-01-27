package strings;

public class FindFirstNonRepeatedChar {

    public static void main(String[] a) {

        String s = "ALTIMETRIAN";
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (s.indexOf(c) != s.lastIndexOf(c)) {
                set.add(c);
            }
        }
        set.forEach(System.out::print);
    }

}
