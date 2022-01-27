package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLeastNumber {

    public static void main(String[] a) {
        List<Integer> list = new ArrayList<>(List.of(3, 6, 8, 10, 4, -1, 2, 0));
        withoutUsingPredefinedMethods(list);
        usingPredefinedMethods(list);
    }

    private static void usingPredefinedMethods(List<Integer> list) {
        Collections.sort(list);
        System.out.println("pre defined methods : "+list.get(1));
    }

    private static void withoutUsingPredefinedMethods(List<Integer> list) {
        int min = list.get(0), secondMin = list.get(0), lastTracedNum = list.get(0);
        for(int num: list) {
            if (num < min) {
                min = num;
            }
            if (num > min && num < lastTracedNum) {
                secondMin = num;
            }
        }
        System.out.println("without predefined methods : "+secondMin);
    }

}
