package collections;

public class CheckParenthesisOrder {

    public static void main(String[] a) {
        String s = "(()){}()";
        System.out.println(checkOrder(s) == true);

        s = "({})";
        System.out.println(checkOrder(s) == true);

        s = "()";
        System.out.println(checkOrder(s) == true);

        s = "{}";
        System.out.println(checkOrder(s) == true);

        s = "({}(";
        System.out.println(checkOrder(s) == false);

        s = "){})";
        System.out.println(checkOrder(s) == false);

        s = "(()";
        System.out.println(checkOrder(s) == false);
    }

    private static boolean checkOrder(String s) {

        if (s.indexOf(0) == '{') return false;

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.isEmpty()) return false;
                    if (stack.peek() == '(') stack.pop();
                    break;
                case '}':
                    if (stack.isEmpty()) return false;
                    if(stack.peek() == '{') stack.pop();
                    break;
            }
        }
        return stack.isEmpty();
    }

}
