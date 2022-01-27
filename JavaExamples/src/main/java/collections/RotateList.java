package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class RotateList {

    public static void main(String[] a) {
        int rotationCnt = 5;
        List<Integer> l = new LinkedList<>();
        l.add(3);l.add(5);l.add(6);l.add(3);l.add(1);l.add(3);l.add(9);l.add(0);l.add(5);

        IntStream.range(0, rotationCnt).forEach(i -> {
            int temp = l.get(0);
            l.remove(0);
            l.add(temp);
            l.forEach(System.out::print);
            System.out.println();
        });
    }

}
