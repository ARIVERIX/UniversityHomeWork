package SemestrTwo.OOP_Inheritance.Polygon;

public class Parallelogram extends Quadrilateral {

    public Parallelogram(int[] sides) throws Exception {
        super(sides);
    }

    @Override
    public String toString() {
        return "Parallelogram contains two pairs of parallel sides\n"
                + "Its perimeter is " + getPerimeter();
    }
}