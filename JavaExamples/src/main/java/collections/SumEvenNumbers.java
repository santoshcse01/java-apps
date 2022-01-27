package collections;

public class SumEvenNumbers {

    public static void main(String[] a) {

        List<Integer> l = new LinkedList<>();
        l.add(3);
        l.add(5);
        l.add(6);
        l.add(3);
        l.add(1);
        l.add(3);
        l.add(9);
        l.add(0);
        l.add(5);

        System.out.println(l.stream().filter(i -> (i % 2 != 0)).reduce((i, j) -> i + j).get());
    }

}
