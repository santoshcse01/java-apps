package collections.stack.examples;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class Example1 {

    public static void main(String[] a) {
        String s = "4 5 6 - 7 +";
        System.out.println(solution(s));
        s = "13 DUP 4 POP 5 DUP + DUP + -";
        System.out.println(solution(s));
        s = "5 6 + -";
        System.out.println(solution(s));
        s = "3 DUP 5 - -";
        System.out.println(solution(s));
        s = "1048575 DUP +";
        System.out.println(solution(s));
    }

    public static int solution(String s) {
        Stack<Integer> stack = new Stack<>();
        double validation = (Math.pow(2, 20) - 1);

        String a[] = s.split(" ");
        AtomicBoolean isExp = new AtomicBoolean(false);

        Arrays.stream(a).forEach(i -> {
            try {
                switch (i) {
                    case "POP":
                        stack.pop();
                        break;
                    case "DUP":
                        stack.push(stack.peek());
                        break;
                    case "+":
                        int val = stack.peek() + stack.get(stack.size() - 2);
                        stack.pop();stack.pop();
                        stack.push(val);
                        break;
                    case "-":
                        int peak = stack.peek();
                        val = stack.get(stack.size() - 2);
                        stack.pop();stack.pop();
                        if (peak > val) stack.push(peak - val);
                        else { isExp.set(true); return; }
                        break;
                    default:
                        val = Integer.parseInt(i);
                        if (val >= validation || val <= 0) { isExp.set(true); return; }
                        stack.push(val);
                }
            } catch (Exception e) {
                isExp.set(true);
                return;
            }
        });
        return (isExp.get())? -1: stack.peek();
    }
}
