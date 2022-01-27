package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

    public static void main(String[] a) {
        List<String> s = new ArrayList<>();
        List<String> s1 = new LinkedList<>();
        List<String> s2 = new Vector<>();// synchronized - similar to arraylist
        List<String> s3 = new Stack<>();

        s.add("a");s.add("b");s.add("c");s.add("d");s.add("a");
        s.remove("a");
        s.forEach(System.out::print);
        System.out.println();

        s1.add("a");s1.add("b");s1.add("c");s1.add("d");s1.add("a");
        s1.remove("a");
        s1.forEach(System.out::print);
    }

}
