package collections.ds;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    List<T> stack = new ArrayList<>();

    public void pop() {
        stack.remove(stack.size()-1);
    }

    public void push(T obj) {
        stack.add(obj);
    }

    public T peek() {
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty() {
        return CollectionUtils.isEmpty(stack);
    }

    public void printStack() {
        stack.forEach(System.out::println);
    }

}
