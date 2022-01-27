package design;

public class AdapterExample {

    public static void main(String[] a) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //hole.fits(smallSqPeg); // Won't compile.

        SquarePegAdapter smallSquareAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSquareAdapter = new SquarePegAdapter(largeSqPeg);
        hole.fits(smallSquareAdapter);
        hole.fits(largeSquareAdapter);

    }

}
