package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CountSortArray {

    public static void main(String[] a) {

        int[] s = {5,2,8,8,5,5,8,1,9,0,1,1,0,1};
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(s).forEach(i -> {
            if (map.get(i) != null) {
                map.put(i, map.get(i)+1);
            } else { map.put(i, 1); }
        });

        map.entrySet().stream().sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).forEach(e -> {
            int key = e.getKey();
            int val = e.getValue();
            IntStream.range(0, val).forEach(i -> System.out.print(key));
        });
    }

}
